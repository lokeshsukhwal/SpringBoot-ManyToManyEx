package com.app.lokesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
