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
import com.studportal.demo.mysql.exp.entity.Students;
import com.studportal.demo.mysql.exp.service.StudentService;

@RestController
@RequestMapping

public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/addstudentdetails")
	public Students poststudentdetails(@RequestBody Students students) {
	return studentservice.studentdetails(students);	
	}
	
	@GetMapping("/getstudentdetails")
	public List<Students> getStudentDetails(){
		return studentservice.getStudents();	 
	}
	
	@GetMapping("/getstudentdetails/{student_id}")
	public Students getStudentId(@PathVariable("student_id") int StudentId) {
		return studentservice.getStudentId(StudentId);	
	}
	
	@PutMapping("/updatestudentdetails/{student_id}")
	public Students updatestudent(@PathVariable("student_id")int StudentId,@RequestBody Students student) {
	    return studentservice.updatestudent(student, StudentId);
	}
	
	@DeleteMapping("/deletestudent/{student_id}")
	public ResponseEntity<String> deletestudent(@PathVariable("student_id")int StudentId) {
		studentservice.deletestudent(StudentId);
		return new ResponseEntity<String>("Student deleted Successfully",HttpStatus.OK);
	}
	
	
}
