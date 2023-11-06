package com.studportal.demo.mysql.exp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studportal.demo.mysql.exp.entity.Students;

public interface StudentRepo extends JpaRepository<Students,Integer>{

}
