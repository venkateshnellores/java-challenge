package jp.co.axa.apidemo.services;

import java.util.List;

import jp.co.axa.apidemo.entities.Employee;

public interface EmployeeService {

	/*
	 * Get All Employee Details
	 * @return List<Employee>
	 */
    public List<Employee> retrieveEmployees();

    /*
     * Get only one Employee by employeeId
     * @return Employee
     */
    public Employee getEmployee(Long employeeId);

    /*
     * Save Employee Data
     */
    public void saveEmployee(Employee employee);

    /*
     * Delete Employee Data by employeeId
     */
    public void deleteEmployee(Long employeeId);

    /*
     * Update Employee details
     */
    public void updateEmployee(Employee employee);
}