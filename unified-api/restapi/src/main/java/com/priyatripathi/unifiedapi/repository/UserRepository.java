package com.priyatripathi.unifiedapi.repository;

import com.priyatripathi.unifiedapi.models.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public interface UserRepository extends JpaRepository<User, Long> {
}
