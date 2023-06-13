package com.cjss.school.service;

import com.cjss.school.exceptions.StaffNotFoundException;
import com.cjss.school.exceptions.StudentNotFound;
import com.cjss.school.model.Staff;
import com.cjss.school.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {

    List<Student> studentList = new ArrayList<>();
    List<Staff> staffList = new ArrayList<>();


    public Student addStudent(Student student){
        Student student1 = new Student(student.getName(),student.getBranch(),student.getYear(),student.getSubjectMarks(),student.getAttendance());
        studentList.add(student1);
        return student1;
    }

    public Staff addStaff(Staff staff){
        Staff staff1 = new Staff(staff.getName(),staff.getEmail(),staff.getSubjects(),staff.getBranchName(),staff.getAttendance());
        staffList.add(staff1);
        return staff1;
    }

    public List<Student> getStudentsByYear(int year) throws StudentNotFound {
      List<Student> students =studentList
                .stream()
                .filter(student -> student.getYear()==year)
                .collect(Collectors.toList());
      if(students.size()>0){
          return students;
      }else{
          throw new StudentNotFound("Students are not available in year: "+year);
      }
    }

    public List<Student> getStudentByDateAndBranch(LocalDate date , String branch) throws StudentNotFound{
        List<Student> students = studentList
                .stream()
                .filter(student ->
                        student.getBranch().equalsIgnoreCase(branch)
                                && student.getAttendance().stream().
                                anyMatch(presentDate->presentDate.getDate().isEqual(date)))
               .collect(Collectors.toList());

        if(students.size()>0){
            return students;
        }else{
            throw new StudentNotFound("Students are not present on "+date+ "in Branch "+branch);
        }
    }


    //staff by present date and subject name
   public List<Staff>  getStaffByDateAndSubject(LocalDate date , String subject) throws StaffNotFoundException {
     List<Staff> staffList1=  staffList.stream()
                .filter(staff -> staff.getAttendance().stream()
                        .anyMatch(d->d.getDate().isEqual(date)))
                .filter(staff -> staff.getSubjects().stream()
                        .anyMatch(sub->sub.getSubjectName().equalsIgnoreCase(subject)))
                .collect(Collectors.toList());
     if(staffList1.size()>0){
         return staffList1;
     }else{
        throw new StaffNotFoundException("There is No Staff exists who is present on "+date+" and teaches "+subject);
     }
   }

    public  List<Student> getStudentsFailedByYear(int year) throws StudentNotFound{
        List<Student> students =  studentList.stream()
                .filter(student -> student.getYear()==year)
                .filter(student -> student.getSubjectMarks().values().stream().anyMatch(marks->marks<35.0) )
                .collect(Collectors.toList());
        if(students.size()>0){
            return students;
        }else{
            throw new StudentNotFound("No Student available who failed in year : "+year);
        }
    }

    public List<Staff> getStaffWhoTeachesByYear(int year) throws  StaffNotFoundException{
//     return    staffList.stream()
//                .filter(
//                        staff -> staff.getSubjects().stream()
//                                .anyMatch(subject ->
//                                        subject.getSubjectBranchYear()
//                                                .values().stream().anyMatch(y -> y==year))
//                ).collect(Collectors.toList());

     List<Staff> staffList1= staffList.stream()
                .filter(
                        staff -> staff.getSubjects().stream()
                                .anyMatch(subject -> subject.getSubjectBranchYear()
                                        .containsValue(year)
                                        )
                ).collect(Collectors.toList());

        if(staffList1.size()>0){
            return staffList1;
        }else {
            throw new StaffNotFoundException("No Staff teaches for the year : "+year);
        }
    }

}



