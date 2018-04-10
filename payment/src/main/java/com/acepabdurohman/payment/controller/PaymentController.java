package com.acepabdurohman.payment.controller;

import com.acepabdurohman.payment.dto.Account;
import com.acepabdurohman.payment.restclient.AccountService;
import org.apache.coyote.http2.ConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account")
    @ResponseStatus(HttpStatus.OK)
    public List<Account> getAccounts(){
        List<Account> accounts = accountService.getList();
        return accounts;
    }

    @PostMapping("/account")
    @ResponseStatus(HttpStatus.OK)
    public String saveAccount(@RequestBody Account account){
        accountService.saveRequest(account);
        return "Sukses";
    }
}
