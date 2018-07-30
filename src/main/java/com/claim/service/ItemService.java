package com.claim.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Item;
import com.claim.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public void addItem(ArrayList<Item> items) {
		System.out.println("in service");
		itemRepository.save(items);
	}
	
	public ArrayList<Item> getByItem(String itemName) {
		System.out.println("in service");
		return itemRepository.getByItem(itemName);
	}

}
