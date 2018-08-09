package hello.repository;

import hello.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
