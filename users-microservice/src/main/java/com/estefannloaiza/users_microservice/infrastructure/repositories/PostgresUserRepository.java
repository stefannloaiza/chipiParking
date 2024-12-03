package com.estefannloaiza.users_microservice.infrastructure.repositories;

import com.estefannloaiza.users_microservice.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PostgresUserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmail(String email);
}