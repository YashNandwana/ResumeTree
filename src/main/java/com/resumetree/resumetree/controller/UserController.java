package com.resumetree.resumetree.controller;

import com.resumetree.resumetree.repositories.UserRepository;
import com.resumetree.resumetree.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepo;

    @GetMapping("/all")
    public List<User> getAll()
    {
        return userRepo.findAll();
    }


}
