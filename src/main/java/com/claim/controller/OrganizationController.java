package com.claim.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.claim.entity.Organization;
import com.claim.service.OrganizationService;


@CrossOrigin
@RestController
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;
	
	@RequestMapping(value="/addOrg",  
			 consumes=MediaType.APPLICATION_JSON_VALUE, 
			 method= RequestMethod.POST ) 
	 private void addOrg(@RequestBody Organization org){ 
		//itemService.addItem(items.get(i));
		organizationService.addOrg(org);	 
		 }
	
	@RequestMapping(value="/loginOrg",  
			 consumes=MediaType.APPLICATION_JSON_VALUE,
			 produces=MediaType.APPLICATION_JSON_VALUE, 
			 method= RequestMethod.POST ) 
	 private ResponseEntity<Organization> loginOrg(@RequestBody Organization org) { 
		System.out.println("in controller");
		 Organization loggedInOrg = organizationService.getOrg(org.getEin(), org.getPassword());
		 System.out.println("loggedIn: "+loggedInOrg);
		 if (loggedInOrg != null) {
			 return new ResponseEntity<>(loggedInOrg, HttpStatus.OK);
		 }
		 else {
			 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		 
		 }
		 
	}
	
	 @RequestMapping(value="/getByOrgName",
			 produces=MediaType.APPLICATION_JSON_VALUE, 
			 method= RequestMethod.GET ) 
	@ResponseBody private ResponseEntity<ArrayList<Organization>> getByOrgName(String orgName) {
		 System.out.println("in controller");
		ArrayList<Organization> organizations = organizationService.getByOrgName(orgName);
		if (organizations != null) {
			System.out.println("in controller orgs is populated");
			return new ResponseEntity<>(organizations, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	 
	 @RequestMapping(value="/getByItem",
			 produces=MediaType.APPLICATION_JSON_VALUE, 
			 method= RequestMethod.GET ) 
	@ResponseBody private ResponseEntity<ArrayList<Organization>> getByItem(String itemName) {
		 System.out.println("in org controller");
		ArrayList<Organization> orgsByItem = organizationService.getByItem(itemName);
		if (orgsByItem != null) {
			System.out.println("in controller items is populated");
			return new ResponseEntity<>(orgsByItem, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	 
	 
		 
}
