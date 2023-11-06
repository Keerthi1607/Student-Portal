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
	@Table(name = "chapters")
	@NoArgsConstructor
	@AllArgsConstructor 
	public class Chapters {
		@Id
		@Column(name = "chapter_id")
		@GeneratedValue
		private int chapter_id;
		
		@Column(name = "chaptername")
		private String Name;

		@ManyToOne
	    @JoinColumn(name = "subject_id", referencedColumnName = "subject_id")
		private Subjects subject;
		

	}


