package ftn.isa.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ftn.isa.model.Enums.EmployeeRoleENUM;

@Entity
@DiscriminatorValue("MS")
public class MedicalStaff extends User
{
	@Column(name = "employeeRole")
	private EmployeeRoleENUM employeeRole;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private MedicalCenter medicalCenter;
	
	public MedicalStaff() 
	{
		
	}

	public EmployeeRoleENUM getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(EmployeeRoleENUM employeeRole) {
		this.employeeRole = employeeRole;
	}

	public MedicalCenter getMedicalCenter() {
		return medicalCenter;
	}

	public void setMedicalCenter(MedicalCenter medicalCenter) {
		this.medicalCenter = medicalCenter;
	}			
}
