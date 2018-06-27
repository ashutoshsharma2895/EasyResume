package com.example.LoginPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginPageService {

    @Autowired
    LoginPageRepo loginPageRepo;

    public String getPasswordFromUserName(String userName)
    {
        String password=loginPageRepo.findByUsername(userName);
        return password;
    }

    public List<LoginPageModel> getAllLoginDetails()
    {
        List<LoginPageModel> list = new ArrayList<>();
        loginPageRepo.findAll().forEach(loginPageModel->list.add(loginPageModel));
        return list;
    }
}
