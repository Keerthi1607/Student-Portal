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

import com.studportal.demo.mysql.exp.entity.Semesters;
import com.studportal.demo.mysql.exp.service.SemesterService;

@RestController
@RequestMapping

public class SemesterController {
	
	@Autowired
	
	private SemesterService semesterservice;
	
	@PostMapping("/addsemester")
	public Semesters postdetails(@RequestBody Semesters semester) {
		return semesterservice.semesterdetails(semester);
	}
	
	@GetMapping("/getsemester")
	public List<Semesters> getSemesterDetails(){
		return semesterservice.getSemsters();
	}
	
	@GetMapping("/getsemester/{semester_id}")
	public Semesters getbyId(@PathVariable("semester_id") int Semester_Id) {
		return semesterservice.getbyId(Semester_Id);
	}
	
	@PutMapping("/updatesemester/{semester_id}")
    public Semesters updatesemester(@PathVariable("semester_id")int Semester_Id,@RequestBody Semesters semester){
		return semesterservice.updatesemester(semester, Semester_Id);	
		}
	
	@DeleteMapping("/deletesemester/{semester_id}")
	public ResponseEntity<String> deletestudent(@PathVariable("semester_id")int SemesterId) {
		semesterservice.deletesemester(SemesterId);
		return new ResponseEntity<String>("Semester deleted Successfully",HttpStatus.OK);
	}
}

	
	