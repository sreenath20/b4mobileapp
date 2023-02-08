package com.mobile.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobile.app.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
