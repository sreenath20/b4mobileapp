package com.mobile.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobile.app.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
