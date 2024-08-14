package com.example.Cart.service;

import com.example.Cart.core.Item;
import com.example.Cart.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public Item save(Item item) {
        return itemRepository.save(item);
    }

    public Item getItemByName(String name) {
        return itemRepository.getItemByName(name);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
