package com.hcl;

public class Employee {

	private String employeeName;
	private String employeeMobileNumber;
	private Long employeeSalary;
	private String employeeEmail;
	private Address address;
	public Employee()
	{
		
	}
	public Employee(String employeeName, String employeeMobileNumber, Long employeeSalary, String employeeEmail,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeMobileNumber = employeeMobileNumber;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.address = address;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	public Long getEmployeeSalary() {
		return employeeSalary;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setEmployeeMobileNumber(String employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	public void setEmployeeSalary(Long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("Name: "+employeeName);
		System.out.println("Mobile: "+employeeMobileNumber);
		System.out.println("Salary: "+employeeSalary);
		System.out.println("Email: "+employeeEmail);
		System.out.println("Address: ");
		address.display();
	}
}
