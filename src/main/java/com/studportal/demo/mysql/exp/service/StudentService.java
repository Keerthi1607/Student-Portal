package com.studportal.demo.mysql.exp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spbot.demo.mysql.exp.exception.ResourceNotFoundException;
import com.studportal.demo.mysql.exp.entity.Students;
import com.studportal.demo.mysql.exp.repository.StudentRepo;

@Service

public class StudentService {
	
	@Autowired
	
	 private StudentRepo studentrepo;
	
	//Post
	 public Students studentdetails(Students students) {
	 return studentrepo.save(students);
	 }
	 
	 //Get
	 public List<Students> getStudents(){
		 return studentrepo.findAll();
	 }
	 
	 //GetbyId
	 public Students getStudentId(int student_id){
			/*
			 * Optional<Students> student = studentrepo.findById(student_id);
			 * if(student.isPresent()) { return student.get(); }else { throw new
			 * ResourceNotFoundException("Students","Id","student_id"); }
			 */
		 return studentrepo.findById(student_id).orElseThrow(() ->
		   new ResourceNotFoundException("Students","Id","student_id"));
	 }
	 
	 //Update
	 public Students updatestudent(Students student, int student_id) {
		 Students existingStudent= studentrepo.findById(student_id).orElseThrow(() ->
		   new ResourceNotFoundException("Students","Id","student_id"));
		 if(student.getName()!=null)
			 existingStudent.setName(student.getName());
		 if(student.getDob()!=null) 
		 existingStudent.setDob(student.getDob());
		 if(student.getEmail()!=null)
		 existingStudent.setEmail(student.getEmail());
		 if(student.getGender()!=null)
		 existingStudent.setGender(student.getGender());
		 if(student.getMobileNum()!=0)
		 existingStudent.setMobileNum(student.getMobileNum());
		 if(student.getPassword()!=null)
		 existingStudent.setPassword(student.getPassword());
		 studentrepo.save(existingStudent);  
		 return existingStudent;
	 } 
	 
	 //Delete
	 public void deletestudent(int student_id) {
			/*
			 * studentrepo.findById(student_id).orElseThrow(() -> new
			 * ResourceNotFoundException("Students","Id","student_id"));
			 */
		 studentrepo.deleteById(student_id);
		 //studentrepo.
	 }
}	 


