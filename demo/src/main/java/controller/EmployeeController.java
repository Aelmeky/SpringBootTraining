package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.IEmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> get(){
		return employeeService.get();
	}
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee emp) {
		employeeService.save(emp);
		return emp;
	}
	

}
