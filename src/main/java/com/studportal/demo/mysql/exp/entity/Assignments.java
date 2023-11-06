package com.studportal.demo.mysql.exp.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

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
    @Table(name = "assignments")
    @NoArgsConstructor
    @AllArgsConstructor 

public class Assignments {
	@Id
	@Column(name = "assignment_id")
	@GeneratedValue
	private int assignment_id;
	
	@Column(name = "assignmentname")
	private String Name;

	@Column(name = "assignment_link")
	private String link;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Column(name="due_date")
	private Date Date;
	
	@Column(name = "maxpoint")
	private int Points;
	
	@ManyToOne
    @JoinColumn(name = "chapter_id", referencedColumnName = "chapter_id")
	private Chapters chapter;
	


}
