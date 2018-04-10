package com.acepabdurohman.payment.restclient;

import com.acepabdurohman.payment.dto.Account;
import org.apache.coyote.http2.ConnectionException;

import java.net.ConnectException;
import java.util.List;

public interface AccountService {

    List<Account> getList();

    String saveRequest(Account account);

}
