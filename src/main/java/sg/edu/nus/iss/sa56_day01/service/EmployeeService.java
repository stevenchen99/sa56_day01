package sg.edu.nus.iss.sa56_day01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.sa56_day01.model.Employee;

@Service
public class EmployeeService {
    
    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee("1", "Steven", "Chen"));
        employees.add(new Employee("2", "Avril", "Rachel"));
        employees.add(new Employee("3", "John", "Doe"));

    }

    public List<Employee> getAllEmployees() {
        return this.employees;
    }
    
    public List<Employee> getEmployeesByLastName(String lastName) {
        List<Employee> filteredEmployees = employees.stream().filter(emp -> emp.getLastName().equals(lastName))
                .toList();
        return filteredEmployees;
    }
}
