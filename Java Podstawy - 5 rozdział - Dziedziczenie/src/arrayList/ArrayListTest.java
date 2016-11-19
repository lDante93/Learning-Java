package arrayList;

import java.util.ArrayList;

public class ArrayListTest
{

	public static void main(String[] args)
	{

		ArrayList<Employee> staff = new ArrayList<>();

		staff.add(new Employee("£ukasz Franczyk", 100000, 1993, 8, 12));
		staff.add(new Employee("Izabela Franczyk", 70000, 1994, 9, 10));

		for (Employee e : staff)
			e.raiseSalary(5);

		for (Employee e : staff)
			System.out.println("name = " + e.getName() + ", salary= " + e.salary + ", hireDay = " + e.getHireDay());

	}
}