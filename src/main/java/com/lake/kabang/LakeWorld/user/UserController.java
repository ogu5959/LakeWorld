package com.lake.kabang.LakeWorld.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/info")
    public User getUserInfo() {
        User user = new User();
        user.setId("Lake");
        user.setName("HoK");
        user.setEmail("lake@email.com");

        return user;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
