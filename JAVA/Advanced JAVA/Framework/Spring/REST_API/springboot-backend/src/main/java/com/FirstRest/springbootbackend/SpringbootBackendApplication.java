package com.FirstRest.springbootbackend;

import com.FirstRest.springbootbackend.model.Employee;
import com.FirstRest.springbootbackend.repository.EmployeeRepository;
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
		Employee employee = new Employee();
		employee.setFirstName("Devayush");
		employee.setLastName("Bajaj");
		employee.setEmailId("Dev@mail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Adzy");
		employee1.setLastName("Bajaj");
		employee1.setEmailId("AdzyDev@mail.com");
		employeeRepository.save(employee1);
	}
}
