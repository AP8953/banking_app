package com.project.banking_app.service;

import com.project.banking_app.dto.AccountDto;

import java.util.List;


public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, Double amount);
    AccountDto withdraw(Long id, Double amount);
    List<AccountDto> getAllAccounts();
    void deleteAccount(Long id);
}
