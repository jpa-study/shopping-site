package com.shopping.jpa.repository;

import com.shopping.jpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CategoryRepository extends JpaRepository<Product, Long> {
}
