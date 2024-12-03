package com.estefannloaiza.plates_microservice;

import org.springframework.boot.SpringApplication;

public class TestPlatesMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(PlatesMicroserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
