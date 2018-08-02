package com.claim.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Item;
import com.claim.repository.ItemRepository;
import com.claim.repository.OrganizationRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private OrganizationRepository organizationRepo;
	
	@Transactional
	public void addItem(Item item) {
		System.out.println("in service");
		item.setOrg(organizationRepo.findOne(item.getOrg().getEin()));
		itemRepository.save(item);
	}
	
	public void addItems(ArrayList<Item> items) {
		System.out.println("in service");
		itemRepository.save(items);
	}
	
	public ArrayList<Item> getNewList(String ein) {
		return itemRepository.getNewList(ein);
	}
	
	
}
