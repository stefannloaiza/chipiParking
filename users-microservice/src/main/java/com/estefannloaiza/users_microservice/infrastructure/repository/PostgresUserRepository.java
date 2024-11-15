package com.estefannloaiza.users_microservice.infrastructure.repository;

import com.estefannloaiza.users_microservice.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostgresUserRepository extends JpaRepository<User, UUID> {

}