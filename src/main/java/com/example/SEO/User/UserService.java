package com.example.SEO.User;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUsers(){
        return new User(
                1L,
                "Lathe",
                "Ward"
        );
    }
}
