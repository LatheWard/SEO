package com.example.SEO.User;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/User")
public class UserController {

    @GetMapping
    public User getUsers(){
        return new User(
                        1L,
                        "Lathe",
                        "Ward"
                );
    }
}
