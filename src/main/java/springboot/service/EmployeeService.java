package springboot.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.model.Employee;

import java.util.List;

/**
 * Interface with methods for use in {@link springboot.controller.EmployeeController}.
 */
@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer employeeId);
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Integer employeeId, Employee employee);
    void deleteEmployee(Integer employeeId);

}
