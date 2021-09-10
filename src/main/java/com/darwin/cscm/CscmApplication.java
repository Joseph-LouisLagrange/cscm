package com.darwin.cscm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class CscmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CscmApplication.class, args);
    }

}
