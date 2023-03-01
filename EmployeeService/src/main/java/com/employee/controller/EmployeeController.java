package com.employee.controller;


import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/addEmployee")
    public ResponseEntity<?> addNewEmployee(@RequestBody Employee employee)
    {
        if(employee!=null && employee.getName()!=null)
        {
            return new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.CREATED);
        }
        else
        {
            return new ResponseEntity<String>("Invalid Request", HttpStatus.BAD_REQUEST);
        }
    }
}
