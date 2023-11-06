package com.studportal.demo.mysql.exp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.studportal.demo.mysql.exp.entity.Branches;
import com.studportal.demo.mysql.exp.service.BranchService;

@RestController
public class BranchController {
	
	@Autowired
	private BranchService branchservice;
	
	@PostMapping("/postbranchdetails")
	public Branches postBranchDetails(@RequestBody Branches branches) {
		return branchservice.branchdetails(branches);
	}

    @GetMapping("/getbranchdetails") 
    public List<Branches> getBranchDetails() {  
    return branchservice.getBranches(); 
  }
   
}
	