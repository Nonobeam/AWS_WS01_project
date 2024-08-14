package com.example.Cart.controller;

import com.example.Cart.core.Cart;
import com.example.Cart.core.Item;
import com.example.Cart.service.CartService;
import com.example.Cart.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/cart")
@RestController
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    private final ItemService itemService;

    @PostMapping("/buy")
    public ResponseEntity<?> buyGoods(@RequestParam("userId") String userId, @RequestParam("itemId") String itemId) {
        boolean isBought = cartService.buy(userId, itemId);
        if (isBought) {
            return ResponseEntity.ok("Buy successful");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/get")
    public ResponseEntity<List<Cart>> getAllCarts() {
        return ResponseEntity.ok(cartService.getAllCarts());
    }
}
