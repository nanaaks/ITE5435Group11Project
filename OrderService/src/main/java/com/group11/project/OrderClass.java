package com.group11.project;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class OrderClass {
	@Id
	private String number;
	private String orderedDate;
	private String shippedDate;
	private String shipTo;
	private double total;

	@Enumerated(EnumType.STRING)
	private OrderStatus status;

	public OrderClass() {
	}

	public OrderClass(String number, String orderedDate, String shippedDate, String shipTo, double total,
			OrderStatus status) {
		this.number = number;
		this.orderedDate = orderedDate;
		this.shippedDate = shippedDate;
		this.shipTo = shipTo;
		this.total = total;
		this.status = status;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(String orderedDate) {
		this.orderedDate = orderedDate;
	}

	public String getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(String shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getShipTo() {
		return shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
}