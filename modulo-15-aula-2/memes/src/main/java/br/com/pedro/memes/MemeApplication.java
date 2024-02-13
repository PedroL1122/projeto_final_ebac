package br.com.pedro.memelandia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.pedro.memes.repositories")
public class MemesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemesApplication.class, args);
	}

}