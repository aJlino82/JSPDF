package com.jspdf.sms.controllers;

import com.jspdf.sms.models.User;
import com.jspdf.sms.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") long id) {
        return userService.findById(id);
    }

    @PostMapping
    public <S extends User> S save(@RequestBody S entity) {
        return userService.save(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id) {
        userService.deleteById(id);
    }
}
