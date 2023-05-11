package springboot.repository;
import org.springframework.data.repository.CrudRepository;
import springboot.model.Employee;

/**
 * Interfaces class Employee with CRUD repository
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
