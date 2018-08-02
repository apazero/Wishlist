package com.claim.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claim.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	@Query("Select I from Item I where org_ein=:ein")
	public ArrayList<Item> getNewList(@Param("ein") String ein);
		
}
