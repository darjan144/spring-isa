package ftn.isa.model;

import ftn.isa.model.Enums.EmployeeRoleENUM;

public class CenterAdmin extends User
{
	private EmployeeRoleENUM employeeRole;

	public EmployeeRoleENUM getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(EmployeeRoleENUM employeeRole) {
		this.employeeRole = employeeRole;
	}
	
	
}
