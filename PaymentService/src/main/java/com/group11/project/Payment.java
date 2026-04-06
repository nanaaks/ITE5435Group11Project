package com.group11.project;

import jakarta.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	private String id;
	private String paidDate;
	private double total;
	private String details;

	public Payment() {
	}

	public Payment(String id, String paidDate, double total, String details) {
		super();
		this.id = id;
		this.paidDate = paidDate;
		this.total = total;
		this.details = details;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}