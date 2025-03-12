package com.priyatripathi.unifiedapi.repository;


import com.priyatripathi.unifiedapi.records.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
