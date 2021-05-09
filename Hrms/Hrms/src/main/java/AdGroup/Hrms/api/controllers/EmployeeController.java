package AdGroup.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AdGroup.Hrms.business.abstracts.EmployeeService;
import AdGroup.Hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/getall")
	public List<Employee> getAll(){
		
		return this.employeeService.getAll();
		
	}

}
