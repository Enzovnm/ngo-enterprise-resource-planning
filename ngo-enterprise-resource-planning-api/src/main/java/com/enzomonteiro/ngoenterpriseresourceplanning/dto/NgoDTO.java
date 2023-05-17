package com.enzomonteiro.ngoenterpriseresourceplanning.dto;

import com.enzomonteiro.ngoenterpriseresourceplanning.entities.Ngo;


public class NgoDTO {
	
	private long id;
	private String name;
	private String registrationNumber;
	private String email;
	private String imgUrl;
	private String site;
	private String state;
	private String city;
	private String postalCode;
	private String district;
	private String address;
	private String addressNumber;
	private String addressComplement;
	private String telephone;
	private String description;
	private Boolean status;
	
	
	public NgoDTO(Ngo entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.registrationNumber = entity.getRegistrationNumber();
		this.email = entity.getEmail();
		this.imgUrl = entity.getImgUrl();
		this.site = entity.getSite();
		this.state = entity.getState();
		this.city = entity.getCity();
		this.postalCode = entity.getPostalCode();
		this.district = entity.getDistrict();
		this.address = entity.getAddress();
		this.addressNumber = entity.getAddressNumber();
		this.addressComplement = entity.getAddressComplement();
		this.telephone = entity.getTelephone();
		this.description = entity.getDescription();
		this.status = entity.getStatus();
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getAddressComplement() {
		return addressComplement;
	}
	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	

}
