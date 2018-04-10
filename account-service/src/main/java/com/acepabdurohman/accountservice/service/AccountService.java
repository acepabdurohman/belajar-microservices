package com.acepabdurohman.accountservice.service;

import com.acepabdurohman.accountservice.model.Account;

import java.util.List;

public interface AccountService {

    void save(Account account);

    List<Account> findAll();

    void saveRequest(Account account);

}
