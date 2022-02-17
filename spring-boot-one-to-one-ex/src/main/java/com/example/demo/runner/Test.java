package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Branch;
import com.example.demo.repo.AdminRepository;
import com.example.demo.repo.BranchRepository;

@Component
public class Test implements CommandLineRunner {

	@Autowired
	private BranchRepository branchRepository;
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public void run(String... args) throws Exception {
		Admin a1 = new Admin(101, "Gopika");
		Admin a2 = new Admin(102, "Gokul");
		
		adminRepository.save(a1);
		adminRepository.save(a2);

		Branch b1 = new Branch(1, "Science", a1);
		Branch b2 = new Branch(2, "Commerce", a2);

		branchRepository.save(b1);
		branchRepository.save(b2);


	}

}
