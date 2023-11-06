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
   @Table(name = "marks")
   @NoArgsConstructor
   @AllArgsConstructor 

public class Marks {
	   @Id
		@Column(name = "mark_id")
		@GeneratedValue
		private int mark_id;
		
		@Column(name = "mark")
		private int mark;

		@ManyToOne
	    @JoinColumn(name = "submission_id", referencedColumnName = "submission_id")
		private Submissions submission;
}
