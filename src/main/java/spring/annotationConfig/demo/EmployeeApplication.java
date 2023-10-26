package spring.annotationConfig.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotationConfig.demo.Controller.EmployeeController;

public class EmployeeApplication {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeController controller = (EmployeeController) context.getBean("employeeController");
		//controller.addEmployee();
		//controller.updateEmployee();
		controller.getAllEmployee();
		//controller.deleteEmployee();
	}
}
