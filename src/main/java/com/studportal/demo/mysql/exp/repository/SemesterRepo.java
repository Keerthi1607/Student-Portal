package com.studportal.demo.mysql.exp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studportal.demo.mysql.exp.entity.Semesters;

public interface SemesterRepo extends JpaRepository<Semesters,Integer>{

}
