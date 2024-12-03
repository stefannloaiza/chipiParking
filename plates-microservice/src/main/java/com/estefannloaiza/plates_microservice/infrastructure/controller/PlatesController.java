package com.estefannloaiza.plates_microservice.infrastructure.controller;

import com.estefannloaiza.plates_microservice.application.usecases.IPlatesUseCases;
import com.estefannloaiza.plates_microservice.domain.entities.Plate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/plates")
@RequiredArgsConstructor
public class PlatesController {

    private final IPlatesUseCases platesUseCases;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Plate savePlate(Plate plate) {
        return platesUseCases.savePlate(plate);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<Plate> findAllPlates() {
        return platesUseCases.findAllPlates();
    }

    @GetMapping("/description/{description}")
    @ResponseStatus(HttpStatus.OK)
    public Plate findPlateByDescription(@PathVariable String description) {
        return platesUseCases.findPlateByDescription(description);
    }
}
