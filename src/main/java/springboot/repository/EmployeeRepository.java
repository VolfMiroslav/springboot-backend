package springboot.repository;
import org.springframework.data.repository.CrudRepository;
import springboot.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
