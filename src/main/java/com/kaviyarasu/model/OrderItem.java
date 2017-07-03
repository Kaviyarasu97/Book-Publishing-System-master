package com.kaviyarasu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.kaviyarasu.model.Order;
import com.kaviyarasu.model.Book;

@Entity
@Table(name = "order_items")

public class OrderItem {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long price;
	
	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "isbn")
	private Book book;

}
