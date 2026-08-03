package com.javaguides.bankingappspring.mapper;

import com.javaguides.bankingappspring.dto.AccountDto;
import com.javaguides.bankingappspring.entity.Account;

public class AccountMapper {

    // accountdto into account jpa entity
    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account(
                // pass details to constructor
//                accountDto.getId(),
//                accountDto.getAccountHolderName(),
//                accountDto.getBalance()


                // remove get from method for record classes
                  accountDto.id(),
                  accountDto.accountHolderName(),
                  accountDto.balance()
        );
        return account;
    }

    // account jpa entity into account dto
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
