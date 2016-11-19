package EmployeeAndManager;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager boss = new Manager("£ukasz Franczyk", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		Employee[] staff = new Employee[3];
		
		staff[0] = boss;
		staff[1] = new Employee("Izabela Stawowczyk", 80000, 1989, 10, 1);		
		staff[2] = new Employee("Daniel Pawlik", 4000, 1990, 3, 1);
		
		for (Employee e :staff)
			System.out.println("name=" + e.getName() + ".salary=" + e.getSalary());
		
		
/*		Manager boss = new Manager("£ukasz Franczyk", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		Manager[] staff = new Manager[3];
		
		staff[0] = boss;
		staff[1] = new Manager("Izabela Stawowczyk", 80000, 1989, 10, 1);
		staff[2] = new Manager("Daniel Pawlik", 4000, 1990, 3, 1);
		
		for (Manager e :staff)
			System.out.println("name=" + e.getName() + ".salary=" + e.getSalary());*/
	}

}
