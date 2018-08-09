package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class DemoCompare {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "aaa", 50));
		employees.add(new Employee(2, "bbb", 40));
		employees.add(new Employee(3, "bbb", 30));
		employees.add(new Employee(3, "ccc", 30));
		
		Comparator<Employee> sortByName = sortByName();
		
		Comparator<Employee> sortBySalary = sortBySalary();
		
		Comparator<Employee> sortByNameAndSalaryDesc = sortByNameAndSalaryDesc();
		
		Collections.sort(employees, sortByName);
		employees.forEach(System.out::println);
		
		System.out.println();
		
		Collections.sort(employees, sortBySalary);
		employees.forEach(System.out::println);
		
		System.out.println();
		
		Collections.sort(employees, sortByNameAndSalaryDesc);
		employees.forEach(System.out::println);
	}

	private static Comparator<Employee> sortByNameAndSalaryDesc() {
		return new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				int resultByName = o1.getName().compareTo(o2.getName());
				int resultBySalary = (int)(o1.getSalary() - o2.getSalary());
				return resultByName + resultBySalary;
			}
		};
	}

	private static Comparator<Employee> sortBySalary() {
		return new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int)(o1.getSalary() - o2.getSalary());
			}
		};
	}

	private static Comparator<Employee> sortByName() {
		return new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
	}
}
