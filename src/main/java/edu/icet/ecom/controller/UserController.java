package edu.icet.ecom.controller;

import edu.icet.ecom.dto.User;
import edu.icet.ecom.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @PostMapping("/login")
    public void login( @RequestBody User user){
        userService.authenticateUser(user.getEmail(), user.getPassword());
    }

}
