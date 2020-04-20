package com.sandeepkamathkr.jpa.jpa.service;

import com.sandeepkamathkr.jpa.jpa.entity.User;
import com.sandeepkamathkr.jpa.jpa.repository.UserDaoService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private final UserDaoService userDaoService;
    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
                .name("Sandeep")
                .role("Admin")
                .build();
        userDaoService.insert(user);
        log.info("New User is Created : "+ user);
    }
}
