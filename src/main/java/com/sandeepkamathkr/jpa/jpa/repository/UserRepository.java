package com.sandeepkamathkr.jpa.jpa.repository;

import com.sandeepkamathkr.jpa.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
