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

import com.studportal.demo.mysql.exp.entity.Subjects;
import com.studportal.demo.mysql.exp.service.SubjectService;

@RestController
@RequestMapping

public class SubjectController {
	
	@Autowired
	private SubjectService subjectservice;
	
	@PostMapping("/addsubject")
	public Subjects addsubject(@RequestBody Subjects subject) {
		return subjectservice.addSubject(subject);
	}
	
	@GetMapping("/getsubjects")
	public List<Subjects> getsubjects(){
		return subjectservice.getSubjects();
	}
	
	@GetMapping("/getsubjects/{subject_id}")
	public Subjects getSubjectId(@PathVariable("subject_id") int subject_id) {
		return subjectservice.getSubjectId(subject_id);
	}
	
	@PutMapping("/modifysubject/{subject_id}")
	public Subjects modifySubjectById(@PathVariable("subject_id") int subject_id,@RequestBody Subjects subject) {
		return subjectservice.modifyDetails(subject, subject_id);
	}
	
	@DeleteMapping("/deletesubject/{subject_id}")
	public ResponseEntity<String> DeleteSubject(@PathVariable("subject_id")  int subject_id) {
		subjectservice.deleteSubject(subject_id);
		return new ResponseEntity<String>("Subject deleted Succesfully",HttpStatus.OK);
	}

}
