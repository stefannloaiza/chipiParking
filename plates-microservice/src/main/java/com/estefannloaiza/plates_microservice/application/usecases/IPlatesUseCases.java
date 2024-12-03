package com.estefannloaiza.plates_microservice.application.usecases;

import com.estefannloaiza.plates_microservice.domain.entities.Plate;

import java.util.Collection;

public interface IPlatesUseCases {
    Plate savePlate(Plate plate);

    Plate findPlateByDescription(String description);

    Collection<Plate> findAllPlates();
}
