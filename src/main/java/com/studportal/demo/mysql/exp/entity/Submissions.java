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
    @Table(name = "submissions")
    @NoArgsConstructor
    @AllArgsConstructor 

public class Submissions {
	@Id
	@Column(name = "submission_id")
	@GeneratedValue
	private int submission_id;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Column(name="submission_date")
	private Date Date;
	
	@Column(name = "score")
	private int Score;

	@Column(name = "comments")
	private String comments;
	
	@ManyToOne
    @JoinColumn(name = "assignment_id", referencedColumnName = "assignment_id")
	private Assignments assignment;
	
	@ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
	private Students student;
}
