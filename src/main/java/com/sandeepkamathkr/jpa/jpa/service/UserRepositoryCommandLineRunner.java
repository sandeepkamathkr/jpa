package com.sandeepkamathkr.jpa.jpa.service;

import com.sandeepkamathkr.jpa.jpa.entity.User;
import com.sandeepkamathkr.jpa.jpa.repository.UserDaoService;
import com.sandeepkamathkr.jpa.jpa.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private final UserRepository userRepository;
    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
                .name("Reshma")
                .role("Admin")
                .build();
        userRepository.save(user);
        log.info("New User is Created with Repository : "+ user);
        log.info("User with id = 2 : "+userRepository.findById(1L).get());
        log.info("All Users : "+userRepository.findAll());
    }
}
