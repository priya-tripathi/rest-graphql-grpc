package com.priyatripathi.unifiedapi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class UnifiedApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnifiedApiApplication.class, args);
	}

}
