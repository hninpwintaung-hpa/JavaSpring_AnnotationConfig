package spring.annotationConfig.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.annotationConfig.demo.Employee;
import spring.annotationConfig.demo.dao.EmployeeDAO;

@Repository
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	public void insert(Employee employee) {
		employeeDAO.insert(employee);
	}

	public void update(Employee employee) {
		employeeDAO.update(employee);
	}

	public List<Employee> findAll() {
       return employeeDAO.findAll();
	}
	public void delete(Employee employee) {
		employeeDAO.delete(employee);
	}
}
