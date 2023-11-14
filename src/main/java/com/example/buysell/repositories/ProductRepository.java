package com.example.buysell.repositories;

import com.example.buysell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/*
Что бы нам не прописывать дао и логику связи с базой данных,получаем такую логику как получить,удалить т.к мы наследуемся от этого интерфейса
*/

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
