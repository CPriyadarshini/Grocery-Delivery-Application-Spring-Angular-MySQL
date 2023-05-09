package com.grocery.order_history.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.order_history.Model.Order;
import com.grocery.order_history.Service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService OrderServices;
	@CrossOrigin("http://localhost:4200")
	@RequestMapping("/getAll")
	public List<Order> getAllOrders(){
		return OrderServices.getAllOrders();
	}
}
