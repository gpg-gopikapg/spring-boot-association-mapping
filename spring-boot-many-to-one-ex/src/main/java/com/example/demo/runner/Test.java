package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repo.DepartmentRepository;
import com.example.demo.repo.EmployeeRepository;

@Component
public class Test implements CommandLineRunner {

	@Autowired
	private DepartmentRepository deptRepo;
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public void run(String... args) throws Exception {
		Department d1 = new Department(101, "Java");
		Department d2 = new Department(102, ".Net");

		deptRepo.save(d1);
		deptRepo.save(d2);

		Employee e1 = new Employee(1, "Gopika", d1);
		Employee e2 = new Employee(2, "Gokul", d1);
		Employee e3 = new Employee(3, "Ajitha", d2);
		Employee e4 = new Employee(4, "Gopi", d2);
		
		empRepo.save(e1);
		empRepo.save(e2);
		empRepo.save(e3);
		empRepo.save(e4);	
	}
}
