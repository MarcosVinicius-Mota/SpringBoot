package com.marcos.projetoWeb.repositories;

import com.marcos.projetoWeb.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    //Se quiser mudar alguma implementação, só dar override. Ele usa implementação padrão do spring
}
