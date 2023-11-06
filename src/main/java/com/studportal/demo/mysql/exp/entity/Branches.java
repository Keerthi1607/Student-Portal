package com.studportal.demo.mysql.exp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "branches")
@NoArgsConstructor
@AllArgsConstructor
public class Branches {
	
	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	@Id
	@Column(name = "branch_id")
	@GeneratedValue
	private int branch_id;
	
	@Column(name = "branchname")
	private String branchname;
	

}
