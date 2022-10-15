package com.app.lokesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
