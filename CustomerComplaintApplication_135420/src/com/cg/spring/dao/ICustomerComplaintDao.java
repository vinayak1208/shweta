package com.cg.spring.dao;
import com.cg.spring.bean.CustomerComplaint;

public interface ICustomerComplaintDao {
	
	public CustomerComplaint addCustomerComplaint(CustomerComplaint customerComplaint);
	public CustomerComplaint displayById(int complaintNo);

}
