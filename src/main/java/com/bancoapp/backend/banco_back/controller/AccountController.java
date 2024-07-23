package com.bancoapp.backend.banco_back.controller;
import org.springframework.http.HttpStatus;
import com.bancoapp.backend.banco_back.entities.Account;
import com.bancoapp.backend.banco_back.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/accounts")

public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> getAllAccounts() {
        List<Account> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }
    
    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<Account>> getAccountByClientId(@PathVariable Long clientId) {  
        List<Account> accounts = accountService.getAccountsByClientId(clientId); 
        return new ResponseEntity<>(accounts, HttpStatus.OK);       
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }
    
    @PostMapping
    public Account saveAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }
    
    @PutMapping("/{id}")
    public Account updateAccount(@PathVariable Long id, @RequestBody Account account) {
        account.setId(id);
        return accountService.updateAccount(account);
    }
    
    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }
}
