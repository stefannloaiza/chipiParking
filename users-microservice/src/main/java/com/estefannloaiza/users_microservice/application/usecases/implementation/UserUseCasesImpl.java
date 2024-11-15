package com.estefannloaiza.users_microservice.application.usecases.implementation;

import com.estefannloaiza.users_microservice.application.usecases.IUserUseCases;
import com.estefannloaiza.users_microservice.domain.entities.User;
import com.estefannloaiza.users_microservice.domain.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserUseCasesImpl implements IUserUseCases {

    private final IUserRepository iUserRepository;

    @Override
    public User save(User user) {
        return iUserRepository.save(user);
    }

    @Override
    public User findById(UUID id) {
        return iUserRepository.findById(id).orElse(null);
    }

    @Override
    public Collection<User> findAll() {
        return iUserRepository.findAll();
    }
}
