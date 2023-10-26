package spring.annotationConfig.demo.dao;

import java.util.List;

import spring.annotationConfig.demo.Employee;

public interface EmployeeDAO {
	public void insert(Employee employee);

	public void update(Employee employee);

	public List<Employee> findAll();

	public void delete(Employee e);
}
