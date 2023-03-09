package com.russell.rest.app.springApp.payroll.service;

import com.russell.rest.app.springApp.payroll.Employee;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeService {

    Employee create(Employee newEmployee);

}
