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
