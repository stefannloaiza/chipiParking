package com.estefannloaiza.users_microservice.application.usecases;

import com.estefannloaiza.users_microservice.domain.entities.User;

import java.util.Collection;
import java.util.UUID;

public interface IUserUseCases {

    User save(User user);

    User findById(UUID id);

    Collection<User> findAll();
}