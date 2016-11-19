package arrayList;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

			// TODO Auto-generated method stub
	private static int nextId = 1;
	private int id;
	private String name;
	public double salary;
	private Date hireDay;

		public Employee(String n, double s, int year, int month, int day)
		{
			name = n;
			salary = s;
			GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
			hireDay = calendar.getTime();
		}	
			
			public String getName()
			{
				return name;
			}
			
			public double getSalary()
			{
				return salary;
			}
			
			public Date getHireDay()
			{
				return hireDay;
			}
			
			public void raiseSalary(double byPercent)
			{
				double raise = salary*byPercent /100;
				salary += raise;
			}
			
			public void setId()
			{
				id=nextId;
				nextId++;
			}
			public int getId()
			{
				return id;
			}
			public static int getNextId()
			{
				return nextId;
			}
			
			public static void main(String[] args) 
			{
			Employee e = new Employee("Grzesiu", 50000, 1994, 9, 10);
			System.out.println(e.getName() + " " + e.getSalary());
			
			}
			
		}
	
		


