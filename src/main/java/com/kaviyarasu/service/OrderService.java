package com.kaviyarasu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaviyarasu.model.Order;
import com.kaviyarasu.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	public void save(Order order) {
		orderRepository.save(order);
		
	}
	
	public List<Order> findAllOrders(){
		return orderRepository.findByOrderByIdDesc();
	}
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findOne(int id){
		return orderRepository.findOne(id);
	}
	
	public List<Order> findByUserIdOrderByIdDesc(int userId){
		return orderRepository.findByUserIdOrderByIdDesc(userId);
	}

}

	



