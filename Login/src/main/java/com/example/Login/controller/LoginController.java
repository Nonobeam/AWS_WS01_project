package com.example.Login.controller;

import com.example.Login.core.Account;
import com.example.Login.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/user")
@RestController
@RequiredArgsConstructor
public class LoginController {
    private final AccountService accountService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Account account) {
        if (accountService.login(account)) {
            return ResponseEntity.ok("Login");
        } else {
            return ResponseEntity.ok("Failed");
        }
    }

    @GetMapping("/get")
    public ResponseEntity<List<Account>> getAll() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.register(account));
    }
}
