package com.estefannloaiza.users_microservice.infrastructure.implementation.postgres;

import com.estefannloaiza.users_microservice.domain.entities.User;
import com.estefannloaiza.users_microservice.infrastructure.repositories.PostgresUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class PostgresUseCasesImpl implements PostgresUseCases {

    private final @Lazy PostgresUserRepository postgresUserRepository;

    @Override
    public User save(User user) {
        return postgresUserRepository.save(user);
    }

    @Override
    public Optional<User> findById(UUID id) {
        return postgresUserRepository.findById(id);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return postgresUserRepository.findByEmail(email);
    }

    @Override
    public Collection<User> findAll() {
        return postgresUserRepository.findAll();
    }
}
