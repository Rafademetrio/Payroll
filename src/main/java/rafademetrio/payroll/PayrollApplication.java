package rafademetrio.payroll;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url="/", description = "Default server URL")})
@SpringBootApplication
public class PayrollApplication {
	public static void main(String[] args) {
		System.out.println("PGHOST: " + System.getenv("PGHOST"));
		System.out.println("PGPORT: " + System.getenv("PGPORT"));
		System.out.println("PGDATABASE: " + System.getenv("PGDATABASE"));
		System.out.println("PGUSER: " + System.getenv("PGUSER"));
		SpringApplication.run(PayrollApplication.class, args);
	}
}
