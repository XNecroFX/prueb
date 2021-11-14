package Reto3_Domingo.Reto3_Domingo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = {"Reto3_Domingo.Reto3_Domingo.Modelo"})
@SpringBootApplication
public class Reto3DomingoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Reto3DomingoApplication.class, args);
	}

}
