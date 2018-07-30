package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@Column(name="email")
	private String email;
	@Column(name="p_word")
	private String password;
	@Column(name="first_Name")
	private String firstName;
	@Column(name="last_Name")
	private String lastName;
	@Column(name="phone")
	private String phone;
	@Column(name="preferred_Contact_Method")
	private char preferredContactMethod;
	@Column(name="role")
	private String role;
	@Column(name="street")
	private String street;
	@Column(name="zip_Code")
	private String zipCode;
	@Column(name="num_Adults_In_Household")
	private int numAdultsInHousehold;
	@Column(name="num_Child_In_Household")
	private int numChildInHousehold;
	@Column(name="allergies")
	private String allergies;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public char getPreferredContactMethod() {
		return preferredContactMethod;
	}
	public void setPreferredContactMethod(char preferredContactMethod) {
		this.preferredContactMethod = preferredContactMethod;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public int getNumAdultsInHousehold() {
		return numAdultsInHousehold;
	}
	public void setNumAdultsInHousehold(int numAdultsInHousehold) {
		this.numAdultsInHousehold = numAdultsInHousehold;
	}
	public int getNumChildInHousehold() {
		return numChildInHousehold;
	}
	public void setNumChildInHousehold(int numChildInHousehold) {
		this.numChildInHousehold = numChildInHousehold;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phone=" + phone + ", preferredContactMethod=" + preferredContactMethod + ", role=" + role
				+ ", street=" + street + ", zipCode=" + zipCode + ", numAdultsInHousehold=" + numAdultsInHousehold
				+ ", numChildInHousehold=" + numChildInHousehold + ", allergies=" + allergies + "]";
	}	
	
}
