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
import org.springframework.web.bind.annotation.RestController;

import com.claim.entity.Item;
import com.claim.entity.Organization;
import com.claim.service.ItemService;

@CrossOrigin
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/addItem",  
			 consumes=MediaType.APPLICATION_JSON_VALUE, 
			 method= RequestMethod.POST ) 
	 private void addItem(@RequestBody Item item){
		System.out.println("Org: "+item.getOrg().getEin());
			 itemService.addItem(item);
		
		 
		 
	 }
	
	@RequestMapping(value="/addItems",  
			 consumes=MediaType.APPLICATION_JSON_VALUE, 
			 method= RequestMethod.POST ) 
	 private void addItems(@RequestBody ArrayList<Item> items){
			 itemService.addItems(items);
		 
		 
	 }
	
	@RequestMapping(value="/getNewlist",  
			 consumes=MediaType.APPLICATION_JSON_VALUE,
			 produces=MediaType.APPLICATION_JSON_VALUE, 
			 method= RequestMethod.POST ) 
	 private ResponseEntity<ArrayList<Item>> getNewlist(@RequestBody Organization org) { 
		System.out.println("in controller");
		 ArrayList<Item> items = itemService.getNewList(org.getEin());
		 if (items != null) {
			 return new ResponseEntity<>(items, HttpStatus.OK);
		 }
		 else {
			 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		 }
		 
	}
	
}
