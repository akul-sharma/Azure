package com.azure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureAssignmentApplication {
	
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@PostMapping("/product")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@GetMapping("/product")
	public List<Employee> getEmployee(){
		return employeeRepo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureAssignmentApplication.class, args);
	}

}
