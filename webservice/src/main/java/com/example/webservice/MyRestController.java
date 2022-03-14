package com.example.webservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyRestController {


    List<Student> students = new ArrayList<>();
    List<Course> courses = new ArrayList<>();

    @GetMapping("students")
    public List<Student> getExams(){
        return students;
    }

    @PostMapping("addstudent")
    public String addStudent(@RequestParam String fname, @RequestParam String lname, @RequestParam String sClass){
        Student e = new Student(fname,lname,sClass);
        students.add(e);
        return "Student added";

    }

    @GetMapping("courses")
    public List<Course> getCourses(){
        return courses;
    }

    @PostMapping("addcourse")
    public String addCourse(@RequestParam String name, @RequestParam String teacher, @RequestParam int points){
        Course p = new Course(name,teacher,points);
        courses.add(p);
        return "Course added";
    }

}
