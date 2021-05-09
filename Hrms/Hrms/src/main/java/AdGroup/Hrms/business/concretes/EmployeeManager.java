package AdGroup.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AdGroup.Hrms.business.abstracts.EmployeeService;
import AdGroup.Hrms.dataAccess.abstracts.EmployeeDao;
import AdGroup.Hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	EmployeeDao employeeDao;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return this.employeeDao.findAll();
	}

	@Override
	public Employee getByEmployeeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
