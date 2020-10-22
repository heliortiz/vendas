package com.hodv.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hodv.vendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
