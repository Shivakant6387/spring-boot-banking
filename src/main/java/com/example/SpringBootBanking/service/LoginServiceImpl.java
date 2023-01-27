package com.example.SpringBootBanking.service;

import com.example.SpringBootBanking.dao.LoginDAO;
import com.example.SpringBootBanking.entity.PrimaryAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDAO loginDAO;


    @Override
    @Transactional
    public String loginCheck(String customerID, String password) {

        return loginDAO.loginCheck(customerID, password);
    }

    @Override
    @Transactional
    public List<PrimaryAccount> getAccount(String accountID) {

        return loginDAO.getAccount(accountID);
    }
}
