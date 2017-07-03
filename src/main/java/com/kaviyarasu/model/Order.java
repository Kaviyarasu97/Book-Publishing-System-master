package com.kaviyarasu.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="orders1")

public class Order {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId;
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", totalPrice=" + totalPrice + ", orderedDate=" + orderedDate
				+ ", modifiedDate=" + modifiedDate + ", cancelledDate=" + cancelledDate + ", deliveredDay="
				+ deliveredDay + ", status=" + status + ", reason=" + reason + "]";
	}

	@NotNull
	@Column(name = "total_price")
	private int totalPrice;
	
	@NotNull
	@Column(name = "ordered_date")
	private LocalDateTime orderedDate;
	
	@Column(name = "modified_date")
	private LocalDate modifiedDate;
	
	@Column(name = "cancelled_date")
    private LocalDate cancelledDate;
	
	@Column(name = "delivered_date")
	private LocalDate deliveredDay;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "reason")
	private String reason;


	@OneToMany(mappedBy = "order", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<OrderItem> orderItems = new ArrayList<>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User user) {
		this.userId = user;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public LocalDateTime getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(LocalDateTime orderedDate) {
		this.orderedDate = orderedDate;
	}

	public LocalDate getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDate modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public LocalDate getCancelledDate() {
		return cancelledDate;
	}

	public void setCancelledDate(LocalDate cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public LocalDate getDeliveredDay() {
		return deliveredDay;
	}

	public void setDeliveredDay(LocalDate deliveredDay) {
		this.deliveredDay = deliveredDay;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	
}
