package com.example.SpringBootBanking.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.SpringBootBanking.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.SpringBootBanking.entity.PrimaryAccount;
import com.example.SpringBootBanking.entity.UserAccount;
import com.example.SpringBootBanking.service.LoginService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String welcome() {

        return "welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginSuccess(HttpServletRequest request, HttpServletResponse response, HttpSession session,
                               UserAccount login, Model theModel) {

        String user = login. getCustomerID();
        String userlogin = loginService.loginCheck(login.getCustomerID(), login.getPassword());
        if (userlogin.equals("success")) {

            List<PrimaryAccount> theAccount = loginService.getAccount(user);
            session.setAttribute("session", user);
            session.setMaxInactiveInterval(10 * 60);
            theModel.addAttribute("customerID", user);
            theModel.addAttribute("theAccount", theAccount);
            return "successful";

        } else {
            theModel.addAttribute("message", "Wrong customerID or Password");
            return "welcome";

        }

    }
}
