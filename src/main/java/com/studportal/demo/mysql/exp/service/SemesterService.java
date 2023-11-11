package com.studportal.demo.mysql.exp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spbot.demo.mysql.exp.exception.ResourceNotFoundException;
import com.studportal.demo.mysql.exp.entity.Semesters;
import com.studportal.demo.mysql.exp.repository.SemesterRepo;

@Service

public class SemesterService {
	
	@Autowired
	
	private SemesterRepo semesterrepo;
	
	//post
	public Semesters semesterdetails(Semesters semester) {
	return semesterrepo.save(semester);
	}
	
	//get
	public List<Semesters> getSemsters(){
		return semesterrepo.findAll();
	}
	
	//GetbyId
	public Semesters getbyId(int semester_id) {
		return semesterrepo.findById(semester_id).orElseThrow(()->
		new ResourceNotFoundException("Semesters","Id","semester_id"));
	}
	
	//Update
	public Semesters updatesemester(Semesters semester,int semester_id) {
		Semesters existingSemester=semesterrepo.findById(semester_id).orElseThrow(()->
		new ResourceNotFoundException("Semesters","Id","semester_id"));
		 if(semester.getName()!=null)
	     existingSemester.setName(semester.getName());
		 semesterrepo.save(existingSemester);
		 return existingSemester;
		
	}
	
	//Delete
	public void deletesemester(int semester_id) {
		/*
		 * semesterrepo.findById(semester_id).orElseThrow(() -> new
		 * ResourceNotFoundException("Semesters","Id","semester_id"));
		 */
	 semesterrepo.deleteById(semester_id);
	}

}
