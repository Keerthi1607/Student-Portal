package com.studportal.demo.mysql.exp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "semesters")
@NoArgsConstructor
@AllArgsConstructor 
public class Semesters {
	
	
	public int getSemester_id() {
		return semester_id;
	}

	public void setSemester_id(int semester_id) {
		this.semester_id = semester_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Branches getBranch() {
		return branch;
	}

	public void setBranch(Branches branch) {
		this.branch = branch;
	}

	@Id
	@Column(name = "semester_id")
	@GeneratedValue
	private int semester_id;
	
	@Column(name = "semestername")
	private String Name;

	@ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
	private Branches branch;
	

}
