package pl.kamilsalega.springdatarest.employeeapi.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.kamilsalega.springdatarest.employeeapi.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {


}
