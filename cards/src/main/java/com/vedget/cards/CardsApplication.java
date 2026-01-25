package com.vedget.cards;

import com.vedget.cards.dto.CardsContactDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*@ComponentScans({ @ComponentScan("com.vedget.cards.controller") })
@EnableJpaRepositories("com.vedget.cards.repository")
@EntityScan("com.vedget.cards.model")*/
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "VedgetBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ramya P",
						email = "ramyap0620@gmail.com",
						url = "https://www.vedget.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.vedget.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "VedgetBank Cards microservice REST API Documentation",
				url = "https://www.Vedget.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
