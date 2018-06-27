package com.example.LoginPage;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "loginpage")
public class LoginPageModel {

    @Id
    private String username;
    private String password;

    public void setusername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getusername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
