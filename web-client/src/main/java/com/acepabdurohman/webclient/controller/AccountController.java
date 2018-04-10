package com.acepabdurohman.webclient.controller;

import com.acepabdurohman.webclient.dto.Account;
import com.acepabdurohman.webclient.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dto/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/list")
    public List<Account> accountList() {
        List<Account> accounts = accountService.getAllAccounts();
        return accounts;
    }

    @RequestMapping("/list/details")
    public Account accountDetails() {
        Account account = accountService.getAccount("1");
        return account;
    }

}
