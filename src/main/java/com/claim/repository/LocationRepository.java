package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claim.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
