package com.estefannloaiza.plates_microservice.infrastructure.implementation.postgres;

import com.estefannloaiza.plates_microservice.domain.entities.Plate;
import com.estefannloaiza.plates_microservice.infrastructure.repository.PostgresPlatesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostgresPlatesUseCasesImpl implements PostgresPlatesUseCases {

    private final PostgresPlatesRepository postgresPlatesRepository;

    @Override
    public Plate save(Plate plate) {
        return postgresPlatesRepository.save(plate);
    }

    @Override
    public Optional<Plate> findByDescription(String description) {
        return postgresPlatesRepository.findByDescription(description);
    }

    @Override
    public Collection<Plate> findAll() {
        return postgresPlatesRepository.findAll();
    }
}