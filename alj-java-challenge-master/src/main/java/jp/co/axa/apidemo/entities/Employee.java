package jp.co.axa.apidemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*
 * Database Table as EMPLOYEE
 * 
 * @author XXXXX
 *
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	public Employee(Long empId, String empName, int empSalary, String empDpt) {
		// TODO Auto-generated constructor stub
		this.id = empId;
		this.name = empName;
		this.salary = empSalary;
		this.department = empDpt;
	}

	/*
	 * Primary Key
	 */
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/*
	 * Employee Name column
	 */
	@Getter
	@Setter
	@Column(name = "EMPLOYEE_NAME")
	private String name;

	/*
	 * Employee Salary column
	 */
	@Getter
	@Setter
	@Column(name = "EMPLOYEE_SALARY")
	private Integer salary;

	/*
	 * Employee Department column
	 */
	@Getter
	@Setter
	@Column(name = "DEPARTMENT")
	private String department;

}
