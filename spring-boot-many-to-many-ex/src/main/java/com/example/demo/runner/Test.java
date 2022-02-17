package com.example.demo.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repo.CourseRepository;
import com.example.demo.repo.StudentRepository;

@Component
public class Test implements CommandLineRunner {

	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(101, "Core Java", 4000.0);
		Course c2 = new Course(102, "Advanced Java", 5000.0);
		Course c3 = new Course(103, "Spring", 5500.0);
		Course c4 = new Course(104, "Spring Boot", 6000.0);
		courseRepository.save(c1);
		courseRepository.save(c2);
		courseRepository.save(c3);
		courseRepository.save(c4);

		Student s1 = new Student(1, "Gopika P G", Set.of(c1, c2));
		Student s2 = new Student(2, "Gokul P G", Set.of(c3, c4));
		Student s3 = new Student(3, "Nithin Wilson", Set.of(c1, c4));
		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);

	}

}
