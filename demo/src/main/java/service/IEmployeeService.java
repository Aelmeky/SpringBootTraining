package service;

import java.util.List;

import model.Employee;

public interface IEmployeeService {

List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee emp);
	
	void delete(int id);
}
