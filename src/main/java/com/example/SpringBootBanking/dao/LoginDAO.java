package com.example.SpringBootBanking.dao;

import com.example.SpringBootBanking.entity.PrimaryAccount;

import java.util.List;

public interface LoginDAO {
    public String loginCheck(String customerID, String password);
    public List<PrimaryAccount> getAccount(String accountID);
}
