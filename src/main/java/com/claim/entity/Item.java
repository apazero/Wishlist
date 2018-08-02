package com.claim.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ITEM_ID")
	private int itemId;
	@Column(name="ITEM_NAME")
	private String itemName;
	@Column(name="ITEM_CATEGORY")
	private String itemCategory;
	@Column(name="ITEM_CONDITION")
	private String itemCondition;
	@Column(name="ITEM_NOTE")
	private String itemNote;
	

	@JsonBackReference
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ORG_EIN")
	private Organization org;
	
//	@Column(name="ORG_EIN")
//	private Integer orgEin;

//	public Integer getOrgEin() {
//		return orgEin;
//	}
//	public void setOrgEin(Integer orgEin) {
//		this.orgEin = orgEin;
//	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public String getItemCondition() {
		return itemCondition;
	}
	public void setItemCondition(String itemCondition) {
		this.itemCondition = itemCondition;
	}
	public String getItemNote() {
		return itemNote;
	}
	public void setItemNote(String itemNote) {
		this.itemNote = itemNote;
	}
	//@JsonIgnore
	public Organization getOrg() {
		return org;
	}
	public void setOrg(Organization org) {
		this.org = org;
	}

}
