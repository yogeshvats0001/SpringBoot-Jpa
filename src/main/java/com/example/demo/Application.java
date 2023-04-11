package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student yogesh = new Student(
                    "yogesh",
                    "vats",
                    "yogesh.vats@gmail.com",
                    25
            );
            studentRepository.save(yogesh);

            Student yogi = new Student(
                    "yogi",
                    "sharma",
                    "yogi.sharma@gmail.com",
                    25
            );
            studentRepository.save(yogesh);
        };
    }

}
