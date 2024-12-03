package com.estefannloaiza.plates_microservice.infrastructure.repository;

import com.estefannloaiza.plates_microservice.domain.entities.Plate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PostgresPlatesRepository extends JpaRepository<Plate, UUID> {

    Optional<Plate> findByDescription(String description);
}