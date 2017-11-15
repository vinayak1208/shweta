package com.cg.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.spring.bean.CustomerComplaint;
import com.cg.spring.dao.ICustomerComplaintDao;



@Service
@Transactional
public class CustomerComplaintService implements ICustomerComplaintService{
	
@Autowired
ICustomerComplaintDao dao;
public ICustomerComplaintDao getDao() {
	return dao;
}
public void setDao(ICustomerComplaintDao dao) {
	this.dao = dao;
}



/**********************************************************************************************
 *Function Name     :addCustomerComplaint(CustomerComplaint customerComplaint)
 *Input Parameters  :CustomerComplaint 
 *Return Type       :CustomerComplaint
 *Author            :SHWETA TRIPATHI
 *Creation Date     :30/10/2017
 *Description       :To add additional details at service layer
 ********************************************************************************************/

public CustomerComplaint addCustomerComplaint(CustomerComplaint customerComplaint)
{
	customerComplaint.setStatus("Open");
String category=customerComplaint.getCategory();
if (category.equalsIgnoreCase("Internet Banking"))
{
	customerComplaint.setPriority("High");
}
if (category.equalsIgnoreCase("General Banking"))
{
	customerComplaint.setPriority("Medium");
}
if (category.equalsIgnoreCase("Others"))
{
	customerComplaint.setPriority("Low");
}
return dao.addCustomerComplaint(customerComplaint);
}

/**********************************************************************************************
 *Function Name     :displayById(int complaintNo)
 *Input Parameters  :int
 *Return Type       :CustomerComplaint
 *Author            :SHWETA TRIPATHI
 *Creation Date     :30/10/2017
 *Description       :To add security method is added to service layer.
 ********************************************************************************************/

public CustomerComplaint displayById(int complaintNo)
{
return dao.displayById(complaintNo);
}

}
