package code88.controller;

import code88.model.Employee;
import code88.request.EmployeeRequest;
import code88.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/code88")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get-all-employees")
    public ResponseEntity getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/save-employee")
    public ResponseEntity saveEmployee(@RequestBody EmployeeRequest employee) {
        return employeeService.saveEmployee(employee);
    }

}
