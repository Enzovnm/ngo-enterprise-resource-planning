package com.enzomonteiro.ngoenterpriseresourceplanning.dto;

import com.enzomonteiro.ngoenterpriseresourceplanning.entities.Ngo;

public class NgoDTO {
	
	private long id;
	private String name;
	private String email;
	private String description;
	private Boolean status;
	
	public NgoDTO(Ngo entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.description = entity.getEmail();
		this.status = entity.getStatus();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getDescription() {
		return description;
	}

	public Boolean getStatus() {
		return status;
	}
	
	
	
	
}
