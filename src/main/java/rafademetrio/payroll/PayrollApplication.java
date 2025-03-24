package rafademetrio.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
