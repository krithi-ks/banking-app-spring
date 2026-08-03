// impl - implementation
// all the impl files goes in this package
package com.javaguides.bankingappspring.service.impl;


import com.javaguides.bankingappspring.dto.AccountDto;
import com.javaguides.bankingappspring.entity.Account;
import com.javaguides.bankingappspring.mapper.AccountMapper;
import com.javaguides.bankingappspring.repository.AccountRepository;
import com.javaguides.bankingappspring.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // implemented this method by hovering near this class
    @Override
    // accountdto to jpa entity -> jpa entity to database
    // for that create mapper package newly
    // after creating add the mapper class here
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    // GET API
    @Override
    public AccountDto getAccountById(Long id) {

        Account account = accountRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exists"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {

        Account account = accountRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exists"));

        double total = account.getBalance() + amount;
        account.setBalance(total);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
