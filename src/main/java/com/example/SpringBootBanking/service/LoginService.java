package com.example.SpringBootBanking.service;

import com.example.SpringBootBanking.entity.PrimaryAccount;

import java.util.List;

public interface LoginService {
    String loginCheck(String customerID, String password);
    public List<PrimaryAccount> getAccount(String accountID);

}
