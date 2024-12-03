package com.estefannloaiza.users_microservice.application.implementation;

import com.estefannloaiza.users_microservice.application.usecases.IUserUseCases;
import com.estefannloaiza.users_microservice.domain.entities.User;
import com.estefannloaiza.users_microservice.domain.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserUseCasesImpl implements IUserUseCases {

    private final IUserRepository iUserRepository;

    @Override
    public User saveUser(User user) {
        return iUserRepository.save(user);
    }

    @Override
    public User findUserById(UUID id) {
        return iUserRepository.findById(id).orElse(null);
    }

    @Override
    public User findUserByEmail(String email) {
        return iUserRepository.findByEmail(email).orElse(null);
    }

    @Override
    public Collection<User> findAllUsers() {
        return iUserRepository.findAll();
    }
}
