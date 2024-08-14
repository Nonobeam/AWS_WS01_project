package com.example.Cart.service;

import com.example.Cart.core.Cart;
import com.example.Cart.core.Item;
import com.example.Cart.repository.CartRepository;
import com.example.Cart.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;
    private final ItemRepository itemRepository;

    public boolean buy(String userId, String itemId) {
        try {
            Item item = itemRepository.findById(itemId).get();
            item.setQuantity(item.getQuantity() - 1);
            itemRepository.save(item);

            Cart cart = Cart.builder()
                    .userId(userId)
                    .itemId(itemId)
                    .build();
            cartRepository.save(cart);
            return true;
        } catch (Error e) {
            return false;
        }
    }

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }
}
