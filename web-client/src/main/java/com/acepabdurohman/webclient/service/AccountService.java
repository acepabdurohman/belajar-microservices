package com.acepabdurohman.webclient.service;

import com.acepabdurohman.webclient.dto.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAllAccounts();

    Account getAccount(String number);
}
