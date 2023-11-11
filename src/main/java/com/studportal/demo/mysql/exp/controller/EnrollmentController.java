package com.studportal.demo.mysql.exp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studportal.demo.mysql.exp.entity.SemesterEnrollment;
import com.studportal.demo.mysql.exp.service.EnrollmentService;

@RestController
@RequestMapping

public class EnrollmentController {
	
	@Autowired
	
	private EnrollmentService enrollmentservice;
	
	@PostMapping("/addenrolledsemesters")
	public SemesterEnrollment addEnrolledDetails(@RequestBody SemesterEnrollment enrolled) {
		return enrollmentservice.enrolledDetails(enrolled);
	}
	
	@GetMapping("/getenrolleddetails")
	public List<SemesterEnrollment> getEnrolledDetails(){
		return enrollmentservice.getEnrolled();
	}
	
	@GetMapping("/getenrolleddetails/{enrollment_id}")
		public SemesterEnrollment getEnrolledId(@PathVariable("enrollment_id") int enrollment_id) {
		return enrollmentservice.getByEnrolledId(enrollment_id);
	}

	@PutMapping("/modifydetails/{enrollment_id}")
	   public SemesterEnrollment modifyEnrolledDetails(@PathVariable("enrollment_id") int enrollment_id,@RequestBody SemesterEnrollment enrolled) {
		return enrollmentservice.getByEnrolledId(enrollment_id);
	}
	
	@DeleteMapping("/removedetails/{enrollment_id}")
	public ResponseEntity<String> deletesemester(@PathVariable("enrollment_id")int EnrollmentId) {
		enrollmentservice.deleteSemester(EnrollmentId);
		return new ResponseEntity<String>("Semester deleted Successfully",HttpStatus.OK);
	}
	
}
