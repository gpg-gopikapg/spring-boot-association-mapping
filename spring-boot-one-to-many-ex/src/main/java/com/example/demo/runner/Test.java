package com.example.demo.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Model;
import com.example.demo.entity.Product;
import com.example.demo.repo.ModelRepository;
import com.example.demo.repo.ProductRepository;

@Component
public class Test implements CommandLineRunner {

	@Autowired
	private ModelRepository modelRepository;
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		Model m1 = new Model("SAMSUNG");
		Model m2 = new Model("REDMI");
		Model m3 = new Model("APPLE");

		modelRepository.save(m1);
		modelRepository.save(m2);
		modelRepository.save(m3);

		Product p1 = new Product("Mbile Phone", Set.of(m1, m2, m3));
		productRepository.save(p1);

	}
}
