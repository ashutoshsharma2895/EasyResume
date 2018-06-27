package com.example.LoginPage;

import org.springframework.data.repository.CrudRepository;

public interface LoginPageRepo extends CrudRepository<LoginPageModel,String> {

    String findByUsername(String userName);
}
