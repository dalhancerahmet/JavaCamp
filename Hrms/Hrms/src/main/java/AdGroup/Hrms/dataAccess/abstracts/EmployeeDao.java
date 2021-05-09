package AdGroup.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import AdGroup.Hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
