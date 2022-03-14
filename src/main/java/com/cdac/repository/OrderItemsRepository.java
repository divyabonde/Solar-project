package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.model.OrderItem;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Integer> {
}