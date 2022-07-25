package com.example.orderservice.repo;

import com.example.orderservice.model.ItemQuantity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemQuantityRepository extends JpaRepository<ItemQuantity, Long> {
}
