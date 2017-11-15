package com.cg.spring.bean;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="complaint")

@NamedQueries(@NamedQuery(name = "getById", query = "SELECT c FROM CustomerComplaint c where complaintId=?"))
public class CustomerComplaint {
	
	@Id
	@SequenceGenerator(name="hibernate_sequence",sequenceName="hibernate_sequence")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "hibernate_sequence")
	private int complaintId;
	@NotEmpty(message="Please Enter Account Id")
	@Pattern(regexp = "[0-9]{10}", message = "Account Id should contain only 10 digits")
	private String accountId;
	@NotEmpty(message="Please Enter Branch Code")
	private String branchCode;
	@NotEmpty(message="Please Enter Email Id")
	@Email(message="Invalid Email Id")
	private String emailId;
	@NotEmpty(message="Please Select Category")
	private String category;
	@NotEmpty(message="Please Enter Description")
	private String description;
	private String priority;
	private String status;

	
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}



}
