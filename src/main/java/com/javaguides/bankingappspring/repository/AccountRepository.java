package com.javaguides.bankingappspring.repository;

import com.javaguides.bankingappspring.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

// pass two param - entity and type of primary key
public interface AccountRepository extends JpaRepository<Account, Long> {

}
