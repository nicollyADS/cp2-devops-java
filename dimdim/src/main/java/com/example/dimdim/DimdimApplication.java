package com.example.dimdim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DimdimApplication {

	public static void main(String[] args) {
		SpringApplication.run(DimdimApplication.class, args);
	}

	@GetMapping("/")
	@ResponseBody
	public String getMessage() {
		return "<h1>Deploy efetuado com sucesso no Servidor Tomcat 10. Bom trabalho!</h1>";
	}
}
