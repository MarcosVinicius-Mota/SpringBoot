package com.marcos.projetoWeb.repositories;

import com.marcos.projetoWeb.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
