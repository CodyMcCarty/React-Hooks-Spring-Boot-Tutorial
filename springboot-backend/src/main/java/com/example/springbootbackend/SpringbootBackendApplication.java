package com.example.springbootbackend;

import com.example.springbootbackend.entity.Employee;
import com.example.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = Employee.builder()
				.firstName("Cody")
				.lastName("McCarty")
				.email("cmccarty@email.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("Bob")
				.lastName("Marley")
				.email("bmarley@email.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("John")
				.lastName("Doe")
				.email("jdoe@email.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
