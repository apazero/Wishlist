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

import com.claim.entity.Item;
import com.claim.entity.Organization;
import com.claim.service.ItemService;

@CrossOrigin
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/addItems",  
			 consumes=MediaType.APPLICATION_JSON_VALUE, 
			 method= RequestMethod.POST ) 
	 private void addItems(@RequestBody ArrayList<Item> items){
		//System.out.println("in controller");
		 //for(int i = 0; i < items.size(); i++) {
			 itemService.addItem(items);
		 //}
		 
		 
	 }
	
	@RequestMapping(value="/getByItem",
			 produces=MediaType.APPLICATION_JSON_VALUE, 
			 method= RequestMethod.GET ) 
	@ResponseBody private ResponseEntity<ArrayList<Item>> getByItem(String itemName) {
		 System.out.println("in item controller");
		ArrayList<Item> items = itemService.getByItem(itemName);
		if (items != null) {
			System.out.println("in controller items is populated");
			return new ResponseEntity<>(items, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
