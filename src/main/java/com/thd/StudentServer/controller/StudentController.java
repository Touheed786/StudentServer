package com.thd.StudentServer.controller;

import com.thd.StudentServer.Services.ServicesImp.StudentServiceImpl;
import com.thd.StudentServer.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;


    @PostMapping("/")
    public Student create(@RequestBody Student student){
        return studentService.createStd(student);
    }

    @GetMapping("/")
    public List<Student> getStudent(){
        return  studentService.getStudent();
    }

    @PutMapping("/bulkDelete")
    public List<Long> bulkDeleteStudent(@RequestParam("selectedIds") List<Long> selectedIds){
        return studentService.bulkDelete(selectedIds);
    }

}
