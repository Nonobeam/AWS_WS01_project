package com.example.Login.service;

import com.example.Login.core.Account;
import com.example.Login.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    public boolean login(Account account) {
        return accountRepository.existsByEmailAndPassword(account.getEmail(), account.getPassword());
    }

    public Account getAccountByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account register(Account account) {
        return accountRepository.save(account);
    }
}
