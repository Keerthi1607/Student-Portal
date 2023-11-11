package com.studportal.demo.mysql.exp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studportal.demo.mysql.exp.entity.SemesterEnrollment;

public interface EnrollmentRepo extends JpaRepository<SemesterEnrollment,Integer>{

}
