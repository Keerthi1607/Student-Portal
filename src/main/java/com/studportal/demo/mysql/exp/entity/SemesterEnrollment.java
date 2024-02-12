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
	
	
	
	public int getEnrollment_id() {
		return enrollment_id;
	}

	public void setEnrollment_id(int enrollment_id) {
		this.enrollment_id = enrollment_id;
	}

	public Semesters getSemester() {
		return semester;
	}

	public void setSemester(Semesters semester) {
		this.semester = semester;
	}

	public Students getStudent() {
		return student;
	}

	public void setStudent(Students student) {
		this.student = student;
	}

	@Id
	@Column(name = "enrollment_id")
	@GeneratedValue
	private int enrollment_id;
	
	
	
	@ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
	private Students student;
	
	@ManyToOne
    @JoinColumn(name = "semestername", referencedColumnName = "semestername",unique=true)
	private Semesters semester;
	



}
