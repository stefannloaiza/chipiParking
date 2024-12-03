package com.estefannloaiza.plates_microservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class PlatesMicroserviceApplicationTests {

	@Test
	void contextLoads() {
	}

}
