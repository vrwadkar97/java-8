package com.predicate.fi;

public class Employee {
	private int id;
	private String name;
	private String city;
	private long salary;
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Employee(int id, String name, String city, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
	
	

}
