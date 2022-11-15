package ftn.isa.dto;

import ftn.isa.model.MedicalCenter;
import ftn.isa.model.MedicalStaff;
import ftn.isa.model.Enums.EmployeeRoleENUM;

public class MedicalStaffDTO extends UserDTO
{
	private EmployeeRoleENUM employeeRole;
	private MedicalCenter medicalCenter;
	
	
	public MedicalStaffDTO() {}
	
	public MedicalStaffDTO(MedicalStaff medicalStaff) 
	{
		this(medicalStaff.getEmployeeRole(),medicalStaff.getMedicalCenter());
	}

	public MedicalStaffDTO(EmployeeRoleENUM employeeRole, MedicalCenter medicalCenter) {
		super();
		this.employeeRole = employeeRole;
		this.medicalCenter = medicalCenter;
	}

	public EmployeeRoleENUM getEmployeeRole() {
		return employeeRole;
	}

	public MedicalCenter getMedicalCenter() {
		return medicalCenter;
	}
	
	
	
		
}
