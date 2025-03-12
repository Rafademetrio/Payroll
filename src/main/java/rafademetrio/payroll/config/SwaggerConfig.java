package rafademetrio.payroll.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
@ComponentScan(basePackages = "rafademetrio.payroll.controller")
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Payroll - REST API")
                        .version("1.0")
                        .description("Project for AVANADE - Decola TECH 2025")
                        .termsOfService("Terms of use: Open Source")
                        .contact(new Contact()
                                .name("Rafael Lucena")
                                .url("http://localhost:8080")
                                .email("rafademetrio@gmail.com")
                        )
                );
    }
}
