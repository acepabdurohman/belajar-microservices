package com.acepabdurohman.payment.restclient.impl;

import com.acepabdurohman.payment.dto.Account;
import com.acepabdurohman.payment.restclient.AccountService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.coyote.http2.ConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    public static final String ACCOUNT_SERVICE_URL = "http://account-service";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "myFallbackHandler")
    public List<Account> getList() {
        Account[] accounts = restTemplate.getForObject(ACCOUNT_SERVICE_URL + "/list", Account[].class);
        return Arrays.asList(accounts);
    }

    public List<Account> myFallbackHandler(){
        return new ArrayList<>();
    }

    @Override
    public String saveRequest(Account account) {
        restTemplate.exchange(ACCOUNT_SERVICE_URL)
        return null;
    }
}
