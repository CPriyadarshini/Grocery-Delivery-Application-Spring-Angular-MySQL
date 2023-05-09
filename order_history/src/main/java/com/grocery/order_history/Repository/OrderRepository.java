package com.grocery.order_history.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.order_history.Model.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
