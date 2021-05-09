package AdGroup.Hrms.business.abstracts;

import java.util.List;

import AdGroup.Hrms.entities.concretes.Employee;

public interface EmployeeService {
	
	List<Employee> getAll();
	Employee getByEmployeeId(int id);
	void add(Employee employee);
	void delete(Employee employee);
	void update(Employee employee);

}
