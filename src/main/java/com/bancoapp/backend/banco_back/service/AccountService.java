package com.bancoapp.backend.banco_back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoapp.backend.banco_back.entities.Account;
import com.bancoapp.backend.banco_back.repository.AccountRepository;
import com.bancoapp.backend.banco_back.repository.ClientRepository;

import java.util.List;
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ClientRepository clientRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
    
    public Account updateAccount(Account account) {
        if (account.getClient() == null || !clientRepository.existsById(account.getClient().getId())) {
            throw new IllegalArgumentException("El cliente no existe");
        }
        return accountRepository.save(account);
    }

    public List<Account> getAccountsByClientId(Long clientId) {
        return accountRepository.findByClientId(clientId);
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
