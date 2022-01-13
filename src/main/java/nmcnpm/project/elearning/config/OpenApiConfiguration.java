package nmcnpm.project.elearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfiguration {
	
	@Bean
	public OpenAPI getOpenApi() {
		return new OpenAPI()
				.info(new Info().title("E-Learning API")
						.description("E-Learning Application for 19Intro2SE")
						.version("v0.0.1")
						.license(new License().name("No License").url("http://springdoc.org"))
						.contact(new Contact()
								.email("trancuongitus@gmail.com")
								.name("Tran Vu Viet Cuong")))
				.externalDocs(new ExternalDocumentation()
						.description("ELearning Documentation")
						.url("https://springshop.wiki.github.org/docs"));
	}
}
