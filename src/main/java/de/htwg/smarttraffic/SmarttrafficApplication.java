package de.htwg.smarttraffic;

import de.htwg.smarttraffic.model.Casestudy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.management.MXBean;

@SpringBootApplication
public class SmarttrafficApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmarttrafficApplication.class, args);
	}

	@Bean
	public Casestudy casestudy(){
		return Casestudy.getInstance();
	}
}
