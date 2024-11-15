package com.estefannloaiza.users_microservice.infrastructure.repository.implementation;

import com.estefannloaiza.users_microservice.domain.entities.User;
import com.estefannloaiza.users_microservice.domain.repository.IUserRepository;
import com.estefannloaiza.users_microservice.infrastructure.repository.PostgresUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryImpl implements IUserRepository {

    private final PostgresUserRepository postgresUserRepository;

    @Override
    public User save(User user) {
        log.info("Saving user: {}", user);
        return postgresUserRepository.save(user);
    }

    @Override
    public Optional<User> findById(UUID id) {
        return postgresUserRepository.findById(id);
    }

    @Override
    public Collection<User> findAll() {
        return postgresUserRepository.findAll();
    }
}
