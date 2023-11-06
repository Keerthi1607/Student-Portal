package com.studportal.demo.mysql.exp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studportal.demo.mysql.exp.entity.Branches;
import com.studportal.demo.mysql.exp.repository.BranchRepo;

@Service

public class BranchService {

	@Autowired
	
	private BranchRepo branchrepo;
	public Branches branchdetails(Branches branches) {
		return branchrepo.save(branches);
		
	}
	  public List<Branches> getBranches(){ 
		  return branchrepo.findAll();
		  }	 
}
