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
   
    @GetMapping("/getbranch/{branch_id}")
    public Branches getBranchById(@PathVariable("branch_id") int branchId) {
    	return branchservice.getBranchId(branchId);
  }
    
    @PutMapping("/modifybranch/{branch_id}")
    public Branches modifyBranchById(@PathVariable("branch_id") int branchId,@RequestBody Branches branches) {
    	return branchservice.modifybranch(branches,branchId);
    }
    
    @DeleteMapping("/removebranch/{branch_id}")
    public ResponseEntity<String> deletebranch(@PathVariable("branch_id")int BranchId) {
		branchservice.removeBranch(BranchId);
		return new ResponseEntity<String>("Student deleted Successfully",HttpStatus.OK);
	}
}
	