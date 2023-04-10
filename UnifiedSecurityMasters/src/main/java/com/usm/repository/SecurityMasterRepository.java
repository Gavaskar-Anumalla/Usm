package com.usm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usm.model.SecurityMaster;


@Repository
public interface SecurityMasterRepository extends JpaRepository<SecurityMaster, String> {

	public Optional<SecurityMaster> findByIsinNumber(String isinNumber);
	
	public List<SecurityMaster>  findBySector(String sector);
	
	public Optional<SecurityMaster> findBySymbol(String symbol);
}
