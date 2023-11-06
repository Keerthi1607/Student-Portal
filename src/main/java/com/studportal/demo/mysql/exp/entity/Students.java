package com.studportal.demo.mysql.exp.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor 
public class Students {
	
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Date getDob() {
		return Dob;
	}

	public void setDob(Date dob) {
		Dob = dob;
	}

	public long getMobileNum() {
		return MobileNum;
	}

	public void setMobileNum(long mobileNum) {
		MobileNum = mobileNum;
	}

	public Branches getBranch() {
		return branch;
	}

	public void setBranch(Branches branch) {
		this.branch = branch;
	}

	@Id
	@Column(name = "student_id")
	@GeneratedValue
	private int student_id;
	
	@Column(name = "fullname")
	private String Name;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="password_id")
	private String Password;
	
	@Column(name="gender")
	private String Gender;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Column(name="dob")
	private Date Dob;
	
	@Column(name="mobilenumber")
    private long MobileNum;
	
	@ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
	private Branches branch;
	
	
}
