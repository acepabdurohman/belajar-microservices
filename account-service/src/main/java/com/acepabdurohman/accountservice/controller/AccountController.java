package com.acepabdurohman.accountservice.controller;

import com.acepabdurohman.accountservice.model.Account;
import com.acepabdurohman.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public List<Account> getList(){
        save();
        return accountService.findAll();
    }

    private void save(){

        Account account = new Account();
        account.setId(1l);
        account.setAmount(10001l);
        account.setName("Acep");
        account.setNumber("123124");
        accountService.save(account);
        Account account2 = new Account();
        account2.setId(2l);
        account2.setAmount(10002l);
        account2.setName("Budi");
        account2.setNumber("12341");
        accountService.save(account2);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody Account account){
        accountService.saveRequest(account);
        return "Sukses";
    }

}
