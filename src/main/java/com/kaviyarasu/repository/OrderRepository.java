package com.kaviyarasu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kaviyarasu.model.Order;

public interface OrderRepository  extends JpaRepository<Order, Integer>{
	

public List<Order> findByUserIdOrderByIdDesc(int userId);
	
	public List<Order> findByOrderByIdDesc();
	
}
