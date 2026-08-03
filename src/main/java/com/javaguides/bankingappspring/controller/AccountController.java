package com.javaguides.bankingappspring.controller;


import com.javaguides.bankingappspring.dto.AccountDto;
import com.javaguides.bankingappspring.entity.Account;
import com.javaguides.bankingappspring.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/accounts") //base url
public class AccountController {

    private AccountService accountService;

    // injected Account Service dependency in constructor based dependency
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // Add Account REST API
    @PostMapping  // spring annotation
    // RequestBody (contains JSON) automatically converts JSON into java object
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    // Get Account REST API
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);  // ok method returns http method
    }

    // Deposit REST API
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
                                              @RequestBody Map<String, Double> request){

        Double amount = request.get("amount");

        AccountDto accountDto = accountService.deposit(id, request.get("amount"));
        return ResponseEntity.ok(accountDto);
    }
}
