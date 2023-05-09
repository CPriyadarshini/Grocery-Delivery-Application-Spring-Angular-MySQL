package com.grocery.order_history.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.order_history.Model.Order;
import com.grocery.order_history.Repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepo;
	public List<Order>getAllOrders(){
		return orderRepo.findAll();
	}
}
