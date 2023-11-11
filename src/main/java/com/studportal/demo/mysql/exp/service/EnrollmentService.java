package com.studportal.demo.mysql.exp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spbot.demo.mysql.exp.exception.ResourceNotFoundException;
import com.studportal.demo.mysql.exp.entity.SemesterEnrollment;
import com.studportal.demo.mysql.exp.repository.EnrollmentRepo;

@Service

public class EnrollmentService {
	
	@Autowired
	
	private EnrollmentRepo enrollmentrepo;
	
	//post
	public SemesterEnrollment enrolledDetails(SemesterEnrollment enrolled) {
		return enrollmentrepo.save(enrolled);
	}
	
	//get
	public List<SemesterEnrollment> getEnrolled(){
		return enrollmentrepo.findAll();
	}
	
	//getById
	public SemesterEnrollment getByEnrolledId(int enrollment_id) {
		return enrollmentrepo.findById(enrollment_id).orElseThrow(()->
		new ResourceNotFoundException("Semester_Enrollment","Id","enrollment_id"));
	}
    
	//update
	public SemesterEnrollment modifyDetails(SemesterEnrollment enrolled,int enrollment_id) {
		SemesterEnrollment existingSemester=enrollmentrepo.findById(enrollment_id).orElseThrow(()->
		new ResourceNotFoundException("Semster_Enrollment","Id","enrollment_id"));
		enrollmentrepo.save(existingSemester);
		return existingSemester;
	}
	
	//delete
	public void deleteSemester(int enrollment_id) {
		 enrollmentrepo.deleteById(enrollment_id);
	}
	
}
