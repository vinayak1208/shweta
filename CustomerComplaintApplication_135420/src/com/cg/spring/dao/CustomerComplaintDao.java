package com.cg.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.cg.spring.bean.CustomerComplaint;


@Repository
public class CustomerComplaintDao implements ICustomerComplaintDao{
	@PersistenceContext
	private EntityManager entityManager;
	
	/**********************************************************************************************
	 *Function Name     :addCustomerComplaint(CustomerComplaint customerComplaint)
	 *Input Parameters  :CustomerComplaint
	 *Return Type       :CustomerComplaint
	 *Author            :SHWETA TRIPATHI
	 *Creation Date     :30/10/2017
	 *Description       :To add data in table   
	 ********************************************************************************************/
	
	public CustomerComplaint addCustomerComplaint(CustomerComplaint customerComplaint)
	{
		entityManager.persist(customerComplaint);
		
		return customerComplaint;
		
	}
	
	/**********************************************************************************************
	 *Function Name     :displayById (int complaintNo)
	 *Input Parameters  :int
	 *Return Type       :CustomerComplaint
	 *Author            :SHWETA TRIPATHI
	 *Creation Date     :30/10/2017
	 *Description       :To retrieve complain details from table by id.
	 ********************************************************************************************/
	
	public CustomerComplaint displayById (int complaintNo)
	{
		Query q=entityManager.createNamedQuery("getById");
		q.setParameter(1,complaintNo);
		return (CustomerComplaint) q.getSingleResult();
	}
	
}
