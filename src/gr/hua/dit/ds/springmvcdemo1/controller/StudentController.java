package gr.hua.dit.ds.springmvcdemo1.controller;

import gr.hua.dit.ds.springmvcdemo1.dao.StudentDAO;
import gr.hua.dit.ds.springmvcdemo1.entity.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = studentDAO.geStudents();
        return students;

    }
}