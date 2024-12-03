package com.estefannloaiza.users_microservice.domain.repository;

import com.estefannloaiza.users_microservice.domain.entities.User;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface IUserRepository {

    User save(User user);

    Optional<User> findById(UUID id);

    Optional<User> findByEmail(String email);

    Collection<User> findAll();
}