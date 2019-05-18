package com.shopping.jpa.repository;

import com.shopping.jpa.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ReviewRepository extends JpaRepository<Review, Long> {
}
