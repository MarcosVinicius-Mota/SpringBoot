package com.marcos.projetoWeb.repositories;

import com.marcos.projetoWeb.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //Se quiser mudar alguma implementação, só dar override. Ele usa implementação padrão do spring
}
