package com.example.newmockup;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Wallet api", description = "This is api docs for wallet in MA"))
public class NewmockupApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewmockupApplication.class, args);
    }

}
