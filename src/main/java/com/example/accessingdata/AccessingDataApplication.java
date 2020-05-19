package com.example.accessingdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataApplication.class, args);
    }

    @Bean
    public CommandLineRunner setData(UserRepository repository) {
        return args -> {
            User user1 = new User();
            user1.setName("john");
            user1.setEmail("john@kookmin.ac.kr");
            repository.save(user1);

            User user2 = new User();
            user2.setName("john");
            user2.setEmail("john2@kookmin.ac.kr");
            repository.save(user2);

            User user3 = new User();
            user3.setName("John");
            user3.setEmail("john3@kookmin.ac.kr");
            repository.save(user3);
        };
    }
}
