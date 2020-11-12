package com.hodv.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hodv.vendas.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
