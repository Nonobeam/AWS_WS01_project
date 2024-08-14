package com.example.Cart.controller;

import com.example.Cart.core.Item;
import com.example.Cart.service.CartService;
import com.example.Cart.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/item")
@RestController
@RequiredArgsConstructor
public class ItemController {
    private final CartService cartService;
    private final ItemService itemService;

    @PostMapping("/add")
    public ResponseEntity<?> addGood(@RequestBody Item item) {
        itemService.save(item);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get")
    public ResponseEntity<?> getAllItems() {
        return ResponseEntity.ok().body(itemService.getAllItems());
    }
}
