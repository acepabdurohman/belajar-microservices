package com.acepabdurohman.accountservice.service.impl;

import com.acepabdurohman.accountservice.model.Account;
import com.acepabdurohman.accountservice.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private List<Account> accounts = new ArrayList<>();

    @Override
    public void save(Account account) {
        accounts.add(account);
    }

    @Override
    public List<Account> findAll() {
        return accounts;
    }

    @Override
    public void saveRequest(Account account) {
        
    }
}
