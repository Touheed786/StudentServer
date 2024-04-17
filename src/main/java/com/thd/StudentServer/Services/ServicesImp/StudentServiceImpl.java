package com.thd.StudentServer.Services.ServicesImp;

import com.thd.StudentServer.model.Student;
import com.thd.StudentServer.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStd(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }
    public long deleteStudent(long id) {
        studentRepository.deleteById(id);
        return id;
    }

    public List<Long> bulkDelete(List<Long> selectedIds){
        List<Long> list = new ArrayList<>();
        for(long id : selectedIds){
            list.add(deleteStudent(id));
        }
        System.out.println(list);
        return list;
    }


}
