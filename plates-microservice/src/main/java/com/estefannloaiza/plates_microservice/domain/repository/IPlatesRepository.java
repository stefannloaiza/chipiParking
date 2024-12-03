package com.estefannloaiza.plates_microservice.domain.repository;

import com.estefannloaiza.plates_microservice.domain.entities.Plate;

import java.util.Collection;
import java.util.Optional;

public interface IPlatesRepository {
    Plate save(Plate plate);

    Optional<Plate> findByDescription(String description);

    Collection<Plate> findAll();
}