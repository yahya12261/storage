package com.example.Storge.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Storge.Models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}

