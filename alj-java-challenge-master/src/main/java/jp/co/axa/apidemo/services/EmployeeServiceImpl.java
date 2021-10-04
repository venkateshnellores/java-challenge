package jp.co.axa.apidemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import jp.co.axa.apidemo.entities.Employee;
import jp.co.axa.apidemo.repositories.EmployeeRepository;

//The EmployeeService class methods are annotated with @Cacheable("Employee"), 
//this annotation is enabling caching in this particular method and cache name is Employee.

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Cacheable("Employee")
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /*
     * Get all Employee Details from Database
     */
    @Cacheable("Employee")
    public List<Employee> retrieveEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }
    
    /*
     * Get particular Employee from Database by employeeId
     */
    @Cacheable("Employee")
    public Employee getEmployee(Long employeeId) {
        Optional<Employee> optEmp = employeeRepository.findById(employeeId);
        return optEmp.get();
    }

    /*
     * Save Employee into Database
     */
    @Cacheable("Employee")
    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    /*
     * Delete Employee from Databse
     */
    @Cacheable("Employee")
    public void deleteEmployee(Long employeeId){
        employeeRepository.deleteById(employeeId);
    }

    /*
     * Update particular Employee into Database by employeeId
     */
    @Cacheable("Employee")
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}