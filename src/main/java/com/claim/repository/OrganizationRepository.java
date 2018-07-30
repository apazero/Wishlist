package com.claim.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claim.entity.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, String> {

	//@Query("Select U from User U where email=:email and password=:password")	
	//public User login (@Param("email") String email, @Param("password")String password);
	
	@Query("Select O from Organization O where ein=:ein and pass_word=:password")
	public Organization loginOrg (@Param("ein") String ein, @Param("password") String password);
	
	@Query("Select O from Organization O where Registered_State='MO' and Business_Name like %:orgName%")
	public ArrayList<Organization> getByOrgName(@Param("orgName") String orgName);
}

