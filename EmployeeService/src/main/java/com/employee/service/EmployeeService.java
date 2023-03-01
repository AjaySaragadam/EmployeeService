package com.employee.service;


import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public Employee addEmployee(Employee employee)
    {
        if(employee!=null)
        {
            return employeeRepository.save(employee);

        }
        else
        {
            return null;
        }

    }
}
