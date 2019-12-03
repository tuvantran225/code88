package code88.service;

import code88.request.EmployeeRequest;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {

    ResponseEntity getAllEmployees();

    ResponseEntity saveEmployee(EmployeeRequest employee);

}
