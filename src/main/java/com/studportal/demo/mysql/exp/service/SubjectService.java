package com.studportal.demo.mysql.exp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spbot.demo.mysql.exp.exception.ResourceNotFoundException;
import com.studportal.demo.mysql.exp.entity.Subjects;
import com.studportal.demo.mysql.exp.repository.SubjectRepo;

@Service

public class SubjectService {
	@Autowired
	
	private SubjectRepo subjectrepo;
	
	//post
	public Subjects addSubject(Subjects subject) {
		return subjectrepo.save(subject);
	}
	
	//get
	public List<Subjects> getSubjects(){
		return subjectrepo.findAll();
	}
	
	//getById
	 public Subjects getSubjectId(int subject_id){
		 return subjectrepo.findById(subject_id).orElseThrow(() ->
		   new ResourceNotFoundException("Subjects","Id","subject_id"));
      }
	 
	 //update
	 public Subjects modifyDetails(Subjects subject,int subject_id) {
		 Subjects existingSubject=subjectrepo.findById(subject_id).orElseThrow(()->
		 new ResourceNotFoundException("Subjects","Id","subject_id"));
		 if(subject.getName()!=null)
			 existingSubject.setName(subject.getName());
		 subjectrepo.save(existingSubject);		 
		 return existingSubject;
	 }
	 
	 //delete
	 public void deleteSubject(int subject_id) {
		 subjectrepo.findById(subject_id).orElseThrow(() -> new
		 ResourceNotFoundException("Subjects","Id","subject_id"));
		 subjectrepo.deleteById(subject_id);
	 }
}

