package com.javaguides.bankingappspring.service;

import com.javaguides.bankingappspring.dto.AccountDto;

public interface AccountService {

    //Account createAccount(Account account);
    // Instead we can pass the DTO (Data Transfer Object)
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);
}
