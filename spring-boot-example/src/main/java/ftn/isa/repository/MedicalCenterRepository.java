package ftn.isa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ftn.isa.model.MedicalCenter;

public interface MedicalCenterRepository extends JpaRepository<MedicalCenter,Long>
{

}
