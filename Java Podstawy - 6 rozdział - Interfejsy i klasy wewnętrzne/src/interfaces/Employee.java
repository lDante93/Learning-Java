package interfaces;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Employee implements Comparable<Employee>
{

	// TODO Auto-generated method stub

	private String name;
	private double salary;

	public Employee(String n, double s) {
		name = n;
		salary = s;

	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public int compareTo(Employee other)
	{
		return Double.compare(salary, other.salary);
	}

}
