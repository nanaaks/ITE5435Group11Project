package com.group11.project;

import jakarta.persistence.*;

@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String createdDate;

	public ShoppingCart() {
	}

	public ShoppingCart(Long id, String createdDate) {
		super();
		this.id = id;
		this.createdDate = createdDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
}