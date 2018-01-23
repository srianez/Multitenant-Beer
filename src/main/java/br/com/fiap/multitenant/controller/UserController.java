package br.com.fiap.multitenant.controller;


import br.com.fiap.multitenant.model.User;
import br.com.fiap.multitenant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Iterator<User> getAll() {
        return userRepository.findAll().iterator();
    }

    @PostMapping
    public void save(@RequestBody User user) {
        userRepository.save(user);
    }

}
