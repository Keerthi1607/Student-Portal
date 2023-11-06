package com.studportal.demo.mysql.exp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studportal.demo.mysql.exp.entity.Branches;

public interface BranchRepo extends JpaRepository<Branches,Integer>{

}
