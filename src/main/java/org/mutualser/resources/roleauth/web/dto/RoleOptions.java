package org.mutualser.resources.roleauth.web.dto;

import java.util.ArrayList;
import java.util.List;

public class RoleOptions {
	private String moduleName;
	private String role;
	private List<String> optionList;
	
	public RoleOptions(String userRole,String moduleName) {
		this.role = userRole;
		this.moduleName = moduleName;
		optionList = new ArrayList<String>();
		optionList.add("OPC1");
		optionList.add("OPC2");
		optionList.add("OPC3");
		optionList.add("OPC4");
		optionList.add("OPC5");
	}
	
	public List<String> getOptionList() {
		return optionList;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public String getRole() {
		return role;
	}
}
