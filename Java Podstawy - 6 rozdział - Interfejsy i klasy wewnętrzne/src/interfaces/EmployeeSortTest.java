package interfaces;

import java.util.Arrays;



public class EmployeeSortTest
{

	public static void main(String[] args)
	{
		
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Izabela Stawowczyk", 80000);		
		staff[1] = new Employee("Zaniel Zawlik", 4000);
		staff[2] = new Employee("£ukasz Franczyk", 120000);	
		
		Arrays.sort(staff);
		
		for (Employee e :staff)
			System.out.println("name=" + e.getName() + ".salary=" + e.getSalary());
		
	}

}
