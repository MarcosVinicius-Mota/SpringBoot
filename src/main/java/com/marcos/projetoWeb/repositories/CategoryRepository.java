package com.marcos.projetoWeb.repositories;

import com.marcos.projetoWeb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
