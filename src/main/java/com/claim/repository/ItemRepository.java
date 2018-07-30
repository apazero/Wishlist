package com.claim.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claim.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	//select business_name
	//from organization as o
	//join item as i on o.ein=i.ein
	//where item_name like '%towel%';
	@Query("Select I from Item I where Item_Name like %:itemName%")
	public ArrayList<Item> getByItem(@Param("itemName") String itemName);
	

}
