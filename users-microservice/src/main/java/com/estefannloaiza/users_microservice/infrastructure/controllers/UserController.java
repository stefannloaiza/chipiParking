package com.estefannloaiza.users_microservice.infrastructure.controllers;

import com.estefannloaiza.users_microservice.application.usecases.IUserUseCases;
import com.estefannloaiza.users_microservice.domain.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final IUserUseCases userUseCases;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(User user) {
        return userUseCases.saveUser(user);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<User> findAll() {
        return userUseCases.findAllUsers();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User findById(@PathVariable UUID id) {
        return userUseCases.findUserById(id);
    }

    @GetMapping("/email/{email}")
    @ResponseStatus(HttpStatus.OK)
    public User findByEmail(@PathVariable String email) {
        return userUseCases.findUserByEmail(email);
    }
}

// plates-microservice - CRU - entity Plate - los campos consideren
// spring initializer - spring web -
// spring data jpa - devtools - lombok - docker-compose -
// postgresql
