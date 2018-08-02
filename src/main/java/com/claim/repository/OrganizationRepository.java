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
	
	@Query("Select O from Organization O where registeredState='MO' and businessName like %:orgName%")
	public ArrayList<Organization> getByOrgName(@Param("orgName") String orgName);
	
	//select business_name
	//from organization as o
	//join item as i on o.ein=i.ein
	//where item_name like '%itemName%';
	@Query(value="Select O.* from Organization as O join Item as I on O.ein=I.org_ein where item_name like %?1%", 
			nativeQuery=true)
	public ArrayList<Organization> getByItem(@Param("itemName") String itemName);
}

	

