package com.marcos.projetoWeb.repositories;

import com.marcos.projetoWeb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
