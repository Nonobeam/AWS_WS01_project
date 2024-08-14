package com.example.Cart.repository;

import com.example.Cart.core.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, String> {
    boolean existsByName(String name);
    Item getItemByName(String name);
}
