package com.cg.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cg.spring.bean.CustomerComplaint;
import com.cg.spring.service.ICustomerComplaintService;






@Controller
public class CustomerController {
	@Autowired
	ICustomerComplaintService service;
	
	public ICustomerComplaintService getService() {
		return service;
	}
	public void setService(ICustomerComplaintService service) {
		this.service = service;
	}

	
	@RequestMapping("/RegisterComplaint")
	public String RegistrationOfComplaint(Model model)
	{
		model.addAttribute("customerComplaint",new CustomerComplaint());
		return "CustomerComplaintRegistrationForm";
	}
	
	@RequestMapping("/Complaint")
	public String Complaint(@ModelAttribute("customerComplaint") @Valid CustomerComplaint customerComplaint ,BindingResult result,Model model)
	{
		if(result.hasErrors()){
			return "CustomerComplaintRegistrationForm";
		}else{
	
		CustomerComplaint complaint=service.addCustomerComplaint(customerComplaint);
		model.addAttribute("complaint",complaint);
		return "ComplaintSuccess";
		}
	}
	@RequestMapping("/status")
	public String checkStatus()
	{ 
    return "CheckComplaint";
	}
	@RequestMapping("/CustomerComplaintId")
	public String Find(@RequestParam(value="complaintId") int complaintNo,Model model)
	{
		CustomerComplaint dto=service.displayById(complaintNo);
		model.addAttribute("bean",dto);
		return "CheckComplaint";
	}
}