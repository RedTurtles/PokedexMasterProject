package de.pokedexmasterproject.pokeapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class PokeapiApplication {

    public static final Logger logger= LoggerFactory.getLogger(PokeapiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PokeapiApplication.class, args);
        logger.info("Start server at http://localhost:8080");
        logger.info("Swagger JSON available at http://localhost:8080/v2/api-docs");
        logger.info("started Swagger UI at http://localhost:8080/swagger-ui.html");
    }

}
