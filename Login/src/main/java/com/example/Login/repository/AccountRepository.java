package com.example.Login.repository;

import com.example.Login.core.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
    boolean existsByEmailAndPassword(String email, String password);
    Account findByEmail(String email);
}
