package com.studportal.demo.mysql.exp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spbot.demo.mysql.exp.exception.ResourceNotFoundException;
import com.studportal.demo.mysql.exp.entity.Branches;
import com.studportal.demo.mysql.exp.repository.BranchRepo;

@Service

public class BranchService {

	@Autowired
	
	//post
	private BranchRepo branchrepo;
	
	public Branches branchdetails(Branches branches) {
		return branchrepo.save(branches);	
	}
	
	//get
	  public List<Branches> getBranches(){ 
		  return branchrepo.findAll();
		  }	
	  
	  //getById
	  public Branches getBranchId(int branch_id){
		  return branchrepo.findById(branch_id).orElseThrow(()->
		  new ResourceNotFoundException("Branches","Id","branch_id"));
	  }
	  
	  //update
	  public Branches modifybranch(Branches branch, int branch_id) {
		  Branches existingBranch = branchrepo.findById(branch_id).orElseThrow(()->
		  new ResourceNotFoundException("Branches","Id","branch_id"));
		  if(branch.getBranchname()!=null)
			  existingBranch.setBranchname(branch.getBranchname());
		  branchrepo.save(existingBranch);
		  return existingBranch;
	  }
	  
	  //delete
	  public void removeBranch(int branch_id) {
		  branchrepo.deleteById(branch_id);
	  }
}
