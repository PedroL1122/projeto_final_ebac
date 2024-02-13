package br.com.pedro.memelandia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.pedro.memecategory.repositories")
public class MemecategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemecategoryApplication.class, args);
	}

}