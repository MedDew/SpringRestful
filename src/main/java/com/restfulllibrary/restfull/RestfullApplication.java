package com.restfulllibrary.restfull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfullApplication {

	public static void main(String[] args) {
                LocalDateTime dt = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
                System.out.println("DATE TIME : "+dt.format(formatter));
		SpringApplication.run(RestfullApplication.class, args);
	}
}
