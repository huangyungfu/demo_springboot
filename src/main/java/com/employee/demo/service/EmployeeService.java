package com.employee.demo.service;

import com.employee.demo.model.Employee;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class EmployeeService {

    private static final Map<Integer, Employee> employeeDB = new HashMap<>();

    static {
        employeeDB.put(1001, new Employee(1001, "Andi", "Backend Developer"));
        employeeDB.put(1002, new Employee(1002, "Mike", "Frontend Developer"));
    }

    public Optional<Employee> getEmployeeById(int id) {
        return Optional.ofNullable(employeeDB.get(id));
    }
}
