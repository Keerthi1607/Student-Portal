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
@Table(name = "semester_enrollment")
@NoArgsConstructor
@AllArgsConstructor 
public class SemesterEnrollment {
	@Id
	@Column(name = "enrollment_id")
	@GeneratedValue
	private int enrollment_id;
	
	@ManyToOne
    @JoinColumn(name = "semester_id", referencedColumnName = "semester_id")
	private Semesters semester;
	
	@ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
	private Students student;



}
