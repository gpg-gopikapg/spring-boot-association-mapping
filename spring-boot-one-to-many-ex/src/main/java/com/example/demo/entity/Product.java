package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue
	private int productId;

	@NonNull
	private String productName;

	@NonNull
	@OneToMany
	@JoinColumn(name = "productId")
	private Set<Model> models;
}
