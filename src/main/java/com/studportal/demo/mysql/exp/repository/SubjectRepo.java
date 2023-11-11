package com.studportal.demo.mysql.exp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studportal.demo.mysql.exp.entity.Subjects;

public interface SubjectRepo extends JpaRepository<Subjects,Integer>{

}
