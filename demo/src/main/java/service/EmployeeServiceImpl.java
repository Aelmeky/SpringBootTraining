package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.IEmployeeDAO;
import model.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private IEmployeeDAO employeeDAO;
	
	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDAO.get();
	}
	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDAO.get(id);
	}
	@Transactional
	@Override
	public void save(Employee emp) {
		employeeDAO.save(emp);
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
