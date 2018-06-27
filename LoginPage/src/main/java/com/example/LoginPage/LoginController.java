package com.example.LoginPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    LoginPageService loginPageService;


    @RequestMapping(method = RequestMethod.POST, value = "/login")
    @ResponseBody
    public Boolean loginCheck(@RequestBody LoginPageModel loginPageModel) {
        String passwordEntered, userName, savedPassword;
        passwordEntered = loginPageModel.getPassword();
        userName = loginPageModel.getusername();
        savedPassword = loginPageService.getPasswordFromUserName(userName);
        if ( passwordEntered != null && !passwordEntered.isEmpty()  && savedPassword != null && !savedPassword.isEmpty()  && savedPassword.contentEquals(passwordEntered))
            return true;
        else
            return false;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/loginDetails")
    public List<LoginPageModel> getAllLoginDetails()
    {
        return loginPageService.getAllLoginDetails();
    }
}


