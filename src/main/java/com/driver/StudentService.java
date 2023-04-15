package com.driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
@Component
public class StudentService {
    @Autowired
    StudentRepository student_repo;
    public void addStudent(Student student){
    student_repo.addStudent(student);
    }

    public void addTeacher(Teacher teacher){
    student_repo.addTeacher(teacher);
    }

    public void addStudentTeacherPair(String student,String teacher){
    student_repo.addStudentTeacherPair(student,teacher);
    }

    public Student getStudentByName(String studentName ){
    return student_repo.getStudentByName(studentName);
    }

    public Teacher getTeacherByName(String teacherName){
    return student_repo.getTeacherByName(teacherName);
    }

    public List<String> getStudentsByTeacherName(String teacherName){
    return student_repo.getStudentsByTeacherName(teacherName);
    }

    public  List<String> allStudent(){
    return student_repo.getAllStudents();
    }

    public void  deleteTeacherByName(String teacherName){
     student_repo.delete_teacher_by_name(teacherName);

    }

    public void deleteAllTeachers(){
    deleteAllTeachers();
    }
}
