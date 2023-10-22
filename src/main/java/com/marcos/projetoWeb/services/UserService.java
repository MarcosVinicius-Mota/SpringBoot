package com.marcos.projetoWeb.services;

import com.marcos.projetoWeb.entities.User;
import com.marcos.projetoWeb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> optional = userRepository.findById(id);
        return optional.get();
    }

}
