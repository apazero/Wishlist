package com.claim.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Organization {
	
	@Id
	@Column(name="EIN")
	private String ein;
	@Column(name="BUSINESS_NAME")
	private String businessName;
	@Column(name="REGISTERED_CITY")
	private String registeredCity;
	@Column(name="REGISTERED_STATE")
	private String registeredState;
	@Column(name="REGISTERED_COUNTRY")
	private String registeredCountry;
	@Column(name="DEDUCT_CODE")
	private String deductCode;
	@Column(name="WEBSITE")
	private String website;
	@Column(name="MISSION_TYPE")
	private String missionType;
	@Column(name="ORG_AKA")
	private String orgAka;
	@Column(name="PICK_UP")
	private boolean pickUp;
	@Column(name="PASS_WORD")
	private String password;
	@Column(name="ACTIVE")
	private boolean active = true;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="org")
	private List<Location> locations = new ArrayList<>();
	@OneToMany(cascade=CascadeType.ALL, mappedBy="org")
	private List<Item> wishlist = new ArrayList<>();
	
	public String getEin() {
		return ein;
	}
	public void setEin(String ein) {
		this.ein = ein;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getRegisteredCity() {
		return registeredCity;
	}
	public void setRegisteredCity(String registeredCity) {
		this.registeredCity = registeredCity;
	}
	public String getRegisteredState() {
		return registeredState;
	}
	public void setRegisteredState(String registeredState) {
		this.registeredState = registeredState;
	}
	public String getRegisteredCountry() {
		return registeredCountry;
	}
	public void setRegisteredCountry(String registeredCountry) {
		this.registeredCountry = registeredCountry;
	}
	public String getDeductCode() {
		return deductCode;
	}
	public void setDeductCode(String deductCode) {
		this.deductCode = deductCode;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getMissionType() {
		return missionType;
	}
	public void setMissionType(String missionType) {
		this.missionType = missionType;
	}
	public String getOrgAka() {
		return orgAka;
	}
	public void setOrgAka(String orgAka) {
		this.orgAka = orgAka;
	}
	public boolean isPickUp() {
		return pickUp;
	}
	public void setPickUp(boolean pickUp) {
		this.pickUp = pickUp;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	public List<Item> getWishlist() {
		return wishlist;
	}
	public void setWishlist(List<Item> wishlist) {
		this.wishlist = wishlist;
	}
	
	

}
