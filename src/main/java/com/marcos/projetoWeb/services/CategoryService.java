package com.marcos.projetoWeb.services;

import com.marcos.projetoWeb.entities.Category;
import com.marcos.projetoWeb.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public  List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        return repository.findById(id).get();
    }

}
