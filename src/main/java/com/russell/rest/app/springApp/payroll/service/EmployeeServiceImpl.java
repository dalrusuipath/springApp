package com.russell.rest.app.springApp.payroll.service;

import com.russell.rest.app.springApp.payroll.Employee;
import com.russell.rest.app.springApp.payroll.EmployeeRepository;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeServiceImpl(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public Employee create(Employee newEmployee) {
        var created = new Employee();
        try {
            // valididate
            // cache
            // save to db
            // map my request to the entity

            created = repo.save(newEmployee);
        } catch (Exception e) {

        }
        return created;
    }
}
