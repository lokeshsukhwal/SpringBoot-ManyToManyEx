package com.app.lokesh.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Course;
import com.app.lokesh.entity.Student;
import com.app.lokesh.repository.CourseRepository;
import com.app.lokesh.repository.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	private CourseRepository crepo;
	
	@Autowired
	private StudentRepository srepo;
	
	public void run(String... args) throws Exception {
		Course c1 = new Course(1, "SpringBoot", 10000.0);
		Course c2 = new Course(2, "ReactJs", 7000.0);
		
		crepo.save(c1);
		crepo.save(c2);
		
		Student s1 = new Student(10, "LOKESH", "ls@gmail.com", Arrays.asList(c1,c2));
		Student s2 = new Student(11, "DESHRAJ", "ds@gmail.com", Arrays.asList(c1,c2));
		
		srepo.save(s1);
		srepo.save(s2);
	}
}
