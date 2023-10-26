package spring.annotationConfig.demo.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import spring.annotationConfig.demo.Employee;
import spring.annotationConfig.demo.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;
	private Employee employee;

	public EmployeeController(EmployeeService empService) {
		this.employeeService = empService;
	}

	public void addEmployee() {
		employee = new Employee();
		employee.setId(2);
		employee.setName("Ma Shwe Moe");
		employee.setEmail("shwemoe@gmail.com");
		employee.setPhone("0834625");
		employee.setAddress("Hpaan");
		employeeService.insert(employee);
	}

	public void updateEmployee() {
		employee = new Employee();
		employee.setId(3);
		employee.setPhone("099999");
		employee.setAddress("Kyaik Hto");
		employeeService.update(employee);
	}

	public void getAllEmployee() {
		List<Employee> employee = employeeService.findAll();
		for (Employee e : employee) {
			System.out.println("Employee name :" + e.getName() + " ," + e.getEmail() + ", " + e.getPhone() + ", "
					+ e.getAddress());
		}
	}

	public void deleteEmployee() {
		employee = new Employee();
		employee.setId(2);
		employeeService.delete(employee);
	}

	public void doWork() {
		System.out.println("Hello");
	}
}
