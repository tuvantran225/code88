package code88.controller;

import code88.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/code88")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get-all-employees")
    public ResponseEntity getAllEmployees() {
        return employeeService.getAllEmployees();
    }

}
