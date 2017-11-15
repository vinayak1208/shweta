package com.cg.assetmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.assetmanagement.bean.Asset;
import com.cg.assetmanagement.bean.AssetAllocation;
import com.cg.assetmanagement.bean.Employee;
import com.cg.assetmanagement.bean.Login;

public interface IAssetDao {
	public AssetAllocation addAssetRequest(AssetAllocation assetRequest,String mgrId);

	public List<Asset> getAssetIds();

	public List<Employee> getEmpIds(String mgrId);

	public Login getLoginDetails(String username, String password);


	public ArrayList<AssetAllocation> viewRequestIds(String empno);
	public String checkQuantity(String assetNo);
	public List<AssetAllocation> viewStatus(int allocationId);

}
