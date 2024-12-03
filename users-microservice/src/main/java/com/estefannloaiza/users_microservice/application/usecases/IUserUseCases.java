package com.estefannloaiza.users_microservice.application.usecases;

import com.estefannloaiza.users_microservice.domain.entities.User;

import java.util.Collection;
import java.util.UUID;

public interface IUserUseCases {

    User saveUser(User user);

    User findUserById(UUID id);

    User findUserByEmail(String email);

    Collection<User> findAllUsers();
}