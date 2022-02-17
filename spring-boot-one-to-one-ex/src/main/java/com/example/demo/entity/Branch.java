package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Branch {
	@Id
	private Integer branchId;
	private String branchName;
	@OneToOne
	@JoinColumn(name = "adminId")
	private Admin admin;

}
