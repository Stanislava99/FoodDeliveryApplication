package com.example.restaurantservice.repos;

import com.example.restaurantservice.models.MenuItem;
import com.example.restaurantservice.services.MenuService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> getAllByRestaurantId(Long restaurantId);
    MenuItem getMenuItemById(Long id);
}
