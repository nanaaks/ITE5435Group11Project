package com.group11.project;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {
	@Id
	private String id;
	private String billingAddress;
	private boolean isClosed;
	private String openDate;
	private String closedDate;

	public Account() {

	}

	public Account(String id, String billingAddress, boolean isClosed, String openDate, String closedDate) {
		super();
		this.id = id;
		this.billingAddress = billingAddress;
		this.isClosed = isClosed;
		this.openDate = openDate;
		this.closedDate = closedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(String closedDate) {
		this.closedDate = closedDate;
	}
}