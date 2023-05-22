package com.enzomonteiro.ngoenterpriseresourceplanning.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_ngo")
public class Ngo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String name;
	@NotNull
	@Column(unique = true,columnDefinition = "char(14)")
	private String registrationNumber;
	@NotNull
	private String email;
	@NotNull
	private String password;
	private String imgUrl;
	private String site;
	@NotNull
	@Column(columnDefinition = "char(2)")
	private String state;
	@NotNull
	private String city;
	@NotNull
	@Column(columnDefinition = "char(8)")
	private String postalCode;
	@NotNull
	private String district;
	@NotNull
	private String address;
	@NotNull
	private String addressNumber;
	private String addressComplement;
	@Column(columnDefinition = "char(10)")
	private String telephone;
	private String description;
	@Column(columnDefinition = "boolean default true")
	private Boolean status;
	
	
	public Ngo() {
		
	}
	
	public Ngo(long id, String name, String email, String password, String imgUrl, String registrationNumber,
			String site, String state, String postalCode, String district, String address, String addressNumber,
			String addressComplement, String telephone, String description, Boolean status) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.imgUrl = imgUrl;
		this.registrationNumber = registrationNumber;
		this.site = site;
		this.state = state;
		this.postalCode = postalCode;
		this.district = district;
		this.address = address;
		this.addressNumber = addressNumber;
		this.addressComplement = addressComplement;
		this.telephone = telephone;
		this.description = description;
		this.status = status;
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


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getRegistrationNumber() {
		return registrationNumber;
	}


	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
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
