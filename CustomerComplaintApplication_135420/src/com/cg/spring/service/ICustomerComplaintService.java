package com.cg.spring.service;


import com.cg.spring.bean.CustomerComplaint;

public interface ICustomerComplaintService {
	public CustomerComplaint addCustomerComplaint(CustomerComplaint customerComplaint);
	public CustomerComplaint displayById(int complaintNo);
}
