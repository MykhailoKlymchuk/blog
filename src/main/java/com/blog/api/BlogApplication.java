package com.blog.api;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "blog api",
                description = "Spring Boot Blog App Rest APIs documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "Mykhailo",
                        email = "mr.mykhailo.klymchuk@gmail.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot Blog App Rest APIs documentation",
                url = "https://github.com/MykhailoKlymchuk/blog"
        )
)
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
