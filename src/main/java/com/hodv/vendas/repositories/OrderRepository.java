package com.hodv.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hodv.vendas.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
