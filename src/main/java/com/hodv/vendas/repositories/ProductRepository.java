package com.hodv.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hodv.vendas.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
