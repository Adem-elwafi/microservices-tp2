package com.iset;

import com.iset.DAO.RoleRepository;
import com.iset.DAO.UserRepository;
import com.iset.entities.Role;
import com.iset.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tp3RestapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp3RestapiApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RoleRepository roleRepo, UserRepository userRepo) {
        return args -> {
            Role admin = roleRepo.save(new Role(null, "ADMIN"));
            Role user = roleRepo.save(new Role(null, "USER"));

            userRepo.save(new User(null, "Najla", "Najla@example.com", admin));
            userRepo.save(new User(null, "Sirine", "Sirine@example.com", user));
            userRepo.save(new User(null, "Nesrine", "Nesrine@example.com", user));

            System.out.println(">>> Données insérées avec succès dans la base H2 !");
        };
    }
}
