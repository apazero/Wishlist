package com.claim.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Organization;
import com.claim.repository.OrganizationRepository;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationRepository organizationRepository;
	
	public void addOrg(Organization org) {
		organizationRepository.save(org);
	}
	
	public Organization getOrg(String ein, String password) {
		System.out.println("in service");
		return organizationRepository.loginOrg(ein, password);
	}
	
	public ArrayList<Organization> getByOrgName(String orgName) {
		System.out.println("in service");
		return organizationRepository.getByOrgName(orgName);
	}


	
}
