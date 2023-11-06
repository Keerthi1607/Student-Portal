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
    @Table(name = "materials")
    @NoArgsConstructor
    @AllArgsConstructor 

public class Materials {
	@Id
	@Column(name = "material_id")
	@GeneratedValue
	private int material_id;
	
	@Column(name = "materialname")
	private String Name;

	@Column(name = "material_link")
	private String link;
	
	@ManyToOne
    @JoinColumn(name = "chapter_id", referencedColumnName = "chapter_id")
	private Chapters chapter;
	


}
