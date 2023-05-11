package springboot.serviceImplementation;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.exception.ResourceNotFoundException;
import springboot.model.Employee;
import springboot.repository.EmployeeRepository;
import springboot.service.EmployeeService;

import java.util.List;

/**
 * Implements {@link EmployeeService} interface.
 */
@Service
public class EmployeeServiceImplementation implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImplementation (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * Creates an employee.
     * @param employee Employee object with all parameters filled.
     * @return Created employee.
     */
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * Gets employee with the given ID.
     * @param employeeID ID of employee.
     * @return Employee.
     * @throws ResourceNotFoundException When employee does not exist.
     */
    @Override
    public Employee getEmployeeById(Integer employeeID) {
        return employeeRepository.findById(employeeID)
                .orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with this ID:" + employeeID));
    }

    /**
     * Updates employee with the given ID.
     * @param employeeId ID of employee.
     * @param employeeDetails Employee object with all parameters filled.
     * @return Updated employee.
     * @throws ResourceNotFoundException When employee does not exist.
     */
    @Override
    public Employee updateEmployee(Integer employeeId, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with this ID:" + employeeId));

        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setDateOfBirth(employeeDetails.getDateOfBirth());
        employee.setPersonalNumber(employeeDetails.getPersonalNumber());
        employee.setIsActive(employeeDetails.getIsActive());

        return employeeRepository.save(employee);
    }

    /**
     * Deletes employee with the given ID.
     * @param employeeId ID of employee.
     * @throws ResourceNotFoundException When employee does not exist.
     */
    @Override
    public void deleteEmployee(Integer employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with this id:" + employeeId));
        employeeRepository.delete(employee);
    }

    /**
     * Gets all employees.
     * @return List of employees.
     */
    @Override
    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }


}
