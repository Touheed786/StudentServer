package com.thd.StudentServer.repositories;

import com.thd.StudentServer.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
