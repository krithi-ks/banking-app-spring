package com.javaguides.bankingappspring.entity;

// JPA
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// JPA Annotations

// lambok annotations
@Getter
@Setter
// constructor related annotations
@NoArgsConstructor
@AllArgsConstructor
// table name
@Table(name = "accounts")
@Entity
public class Account {

    // primary key
    @Id
    // automatically increment primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // column name
    @Column(name = "account_holder_name")
    private String accountHolderName;
    private double balance;
}
