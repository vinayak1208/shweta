package com.cg.assetmanagement.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.assetmanagement.bean.Asset;
import com.cg.assetmanagement.bean.AssetAllocation;
import com.cg.assetmanagement.bean.Employee;
import com.cg.assetmanagement.service.IAssetAllocationService;

@Controller
@RequestMapping("Asset")
public class AssetController {
	@Autowired
	private IAssetAllocationService service;
	
	public IAssetAllocationService getService() {
		return service;
	}
	public void setService(IAssetAllocationService service) {
		this.service = service;
	}

	@RequestMapping("/Home")
	public String Home(HttpServletRequest request,Model model)
	{
		HttpSession session = request.getSession();
		if(session.getAttribute("username")!=null && session.getAttribute("password")!=null){
			String mgrId= (String) session.getAttribute("empNo");
			System.out.println(mgrId);
			ArrayList<AssetAllocation> allocId=service.viewRequestIds(mgrId);
			model.addAttribute("allocId",allocId);
		return "views/HomePage";
		}
		else{
			return "redirect:../index2.asset";
		}
		
		
	}
	
	@RequestMapping("/raiseRequest")
	public ModelAndView RaiseRequest(HttpServletRequest request,Model model)
	{
		
		HttpSession session = request.getSession(false);
	if(session.getAttribute("username")!=null && session.getAttribute("password")!=null){
		List<Asset> assetIds = service.getAssetIds();
		String mgrId= (String) session.getAttribute("empNo");
		ArrayList<AssetAllocation> allocId=service.viewRequestIds(mgrId);
		model.addAttribute("allocId",allocId);
		
		
		
		List<Employee> empIds = service.getEmpIds(mgrId);
		System.out.println(empIds);
		model.addAttribute("assetIds", assetIds);
		model.addAttribute("empIds", empIds);

		return new ModelAndView("views/RequestForm","allocation",new AssetAllocation());
	}
	else{
		return new ModelAndView("redirect:../index2.asset");
	}
}
	
	@RequestMapping("/insertRequest")
	public String InsertRequest(@ModelAttribute("allocation") @Valid AssetAllocation assetRequest ,BindingResult result,Model model,HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		if(session.getAttribute("username")!=null && session.getAttribute("password")!=null){
		if(result.hasErrors()){
			
			
			List<Asset> assetIds = service.getAssetIds();
			String mgrId= (String) session.getAttribute("empNo");
			ArrayList<AssetAllocation> allocId=service.viewRequestIds(mgrId);
			model.addAttribute("allocId",allocId);
			
			
			
			List<Employee> empIds = service.getEmpIds(mgrId);
			
			model.addAttribute("assetIds", assetIds);
			model.addAttribute("empIds", empIds);
			model.addAttribute("allocation",assetRequest);
			return "views/RequestForm";
		}
		else{
			
			String mgrId= (String) session.getAttribute("empNo");
			ArrayList<AssetAllocation> allocId=service.viewRequestIds(mgrId);
			model.addAttribute("allocId",allocId);
			String quantity=service.checkQuantity(assetRequest.getAssetId());
			System.out.println(quantity);
			if(quantity.equals("0"))
			{
				
				String display="Insufficient Quantity. Request cannot be raised";
				model.addAttribute("errorMessage",display);
			
		}else{
			
			AssetAllocation assetRequestSuccess=service.addAssetRequest(assetRequest,mgrId);
			model.addAttribute("requestId",assetRequestSuccess.getAllocationId());
			String successMessage=" Your request has been raised successfully. The Request No is ";
			model.addAttribute("successMessage",successMessage);
		}
		return "views/RequestSuccess";
		}
	}
		else{
			return "redirect:../index2.asset";
		}
	}
	@RequestMapping("/viewStatus")
	public ModelAndView ViewStatus(@RequestParam("allocationId") int allocationId, HttpServletRequest request,Model model)
	{
		HttpSession session = request.getSession(false);
		if(session.getAttribute("username")!=null && session.getAttribute("password")!=null){
		String mgrId= (String) session.getAttribute("empNo");
		System.out.println(mgrId);
		ArrayList<AssetAllocation> allocId=service.viewRequestIds(mgrId);
		model.addAttribute("allocId",allocId);
		List<AssetAllocation> status=service.viewStatus(allocationId);
		return new ModelAndView("views/Status","status",status);
		}
		else{
			return new ModelAndView("redirect:../index2.asset");
		}
	}
	
	@RequestMapping("/contact")
	public String Contact(HttpServletRequest request,Model model)
	{
		HttpSession session = request.getSession(false);
		
		if(session.getAttribute("username")!=null && session.getAttribute("password")!=null){
			
			String mgrId= (String) session.getAttribute("empNo");
			System.out.println(mgrId);
			ArrayList<AssetAllocation> allocId=service.viewRequestIds(mgrId);
			model.addAttribute("allocId",allocId);
		return "views/Contact";
		}
		else{
			return "redirect:../index2.asset";
		}
	}
	
	
	@RequestMapping("/logout")
	public String logoutAction(HttpServletRequest req,Model m){
		System.out.println("in logout ");
		HttpSession session = req.getSession(false);

			session.setAttribute("valid", false);
			session.setAttribute("username", null);
			session.setAttribute("password", null);
			
			session.invalidate();
			
			
		return "redirect:../index.asset";
	}


}