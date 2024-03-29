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
	@Table(name = "subjects")
	@NoArgsConstructor
	@AllArgsConstructor 
	public class Subjects {
		
		public int getSubject_id() {
			return subject_id;
		}

		public void setSubject_id(int subject_id) {
			this.subject_id = subject_id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public Semesters getSemester_id() {
			return semester_id;
		}

		public void setSemester_id(Semesters semester_id) {
			this.semester_id = semester_id;
		}

		@Id
		@Column(name = "subject_id")
		@GeneratedValue
		private int subject_id;
		
		@Column(name = "subjectname")
		private String Name;

		@ManyToOne
	    @JoinColumn(name = "semester_id", referencedColumnName = "semester_id")
		private Semesters semester_id;
		

	}


