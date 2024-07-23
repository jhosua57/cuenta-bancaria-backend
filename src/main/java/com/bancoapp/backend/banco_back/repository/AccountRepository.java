package com.bancoapp.backend.banco_back.repository;

import com.bancoapp.backend.banco_back.entities.Account;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByClientId(Long clientId);
}
