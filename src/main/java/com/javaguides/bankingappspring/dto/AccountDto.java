package com.javaguides.bankingappspring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

// auto creates getter, setters
@Data
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;
}
