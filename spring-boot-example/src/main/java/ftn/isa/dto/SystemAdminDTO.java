package ftn.isa.dto;

import ftn.isa.model.SystemAdmin;

public class SystemAdminDTO extends UserDTO
{
	private boolean isAdmin;
	
	public SystemAdminDTO() {}
	
	public SystemAdminDTO(SystemAdmin systemAdmin) 
	{
		this(systemAdmin.isAdmin());
	}

	public SystemAdminDTO(boolean isAdmin) {
		super();
		this.isAdmin = isAdmin;
	}

	public boolean isAdmin() {
		return isAdmin;
	}
}
