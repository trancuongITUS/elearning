package nmcnpm.project.elearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
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
						.license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
						.description("ELearning Documentation")
						.url("https://springshop.wiki.github.org/docs"));
	}
}
