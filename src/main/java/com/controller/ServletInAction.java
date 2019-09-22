package com.controller;


import com.dao.IAccount;
import com.dao.IUser;
import com.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ServletInAction {

    @Autowired
    IAccount account;

    @Autowired
    IUser user;

    @GetMapping(value = "/richest")
    public String richestUser() {
        System.out.println("hello");
        AccountEntity accountEntity = account.findById();

        System.out.println(accountEntity.toString());
        return "index";
    }

}
