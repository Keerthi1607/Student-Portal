package com.studportal.demo.mysql.exp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studportal.demo.mysql.exp.entity.Chapters;

public interface ChapterRepo extends JpaRepository<Chapters,Integer>{

}
