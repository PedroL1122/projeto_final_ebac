package br.com.pedro.memelandia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableFeignClients(basePackages = "br.com.pedro.memelandia.feign")
public class MemelandiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemelandiaApplication.class, args);
	}

}
