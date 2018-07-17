package br.com.rmacario.carsstorageapi.pojos;

import org.springframework.data.annotation.Id;

public class Car {

	@Id
	private String id;
	
	private String name;
	private String dateTimeRegistered;
	private String category;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateTimeRegistered() {
		return dateTimeRegistered;
	}

	public void setDateTimeRegistered(String dateTimeRegistered) {
		this.dateTimeRegistered = dateTimeRegistered;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
