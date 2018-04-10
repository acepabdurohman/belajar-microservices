package com.acepabdurohman.webclient.service.impl;

import com.acepabdurohman.webclient.dto.Account;
import com.acepabdurohman.webclient.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    public static final String ACCOUNT_SERVICE_URL = "http://account-service";

    @Autowired
    protected RestTemplate restTemplate;

    protected String serviceUrl;

    /*public AccountServiceImpl(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
                : "http://" + serviceUrl;
    }*/

    @Override
    public List<Account> getAllAccounts() {
        //Account[] accounts = restTemplate.getForObject(serviceUrl+"/account/list", Account[].class);
        Account[] accounts = restTemplate.getForObject(ACCOUNT_SERVICE_URL+"/list", Account[].class);
        return Arrays.asList(accounts);
    }

    @Override
    public Account getAccount(String number) {
        /*return restTemplate.getForObject(serviceUrl + "/account/{id}",
                Account.class, number);*/
        return restTemplate.getForObject(ACCOUNT_SERVICE_URL + "/{id}",
                Account.class, number);
    }
}
