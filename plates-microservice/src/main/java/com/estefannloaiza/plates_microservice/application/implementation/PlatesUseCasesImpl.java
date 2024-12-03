package com.estefannloaiza.plates_microservice.application.implementation;

import com.estefannloaiza.plates_microservice.application.usecases.IPlatesUseCases;
import com.estefannloaiza.plates_microservice.domain.entities.Plate;
import com.estefannloaiza.plates_microservice.domain.repository.IPlatesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlatesUseCasesImpl implements IPlatesUseCases {

    private final IPlatesRepository platesRepository;

    @Override
    public Plate savePlate(Plate plate) {
        return platesRepository.save(plate);
    }

    @Override
    public Plate findPlateByDescription(String description) {
        return platesRepository.findByDescription(description).orElse(null);
    }

    @Override
    public Collection<Plate> findAllPlates() {
        return platesRepository.findAll();
    }
}