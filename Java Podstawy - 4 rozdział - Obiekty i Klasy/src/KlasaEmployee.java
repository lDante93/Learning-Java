import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class KlasaEmployee {

	public static void main(String[] args) {
		
		
/*		KlasaEmployee2 staff = new KlasaEmployee2("£ukasz Franczyk", 100000, 1993, 8, 12);
		System.out.println("name = " + staff.getName() + ", salary= " + staff.getSalary() + ", hireDay = " + staff.getHireDay());*/
		
		KlasaEmployee2[] staff = new KlasaEmployee2[2];
		
		staff[0]= new KlasaEmployee2("£ukasz Franczyk", 100000, 1993, 8, 12);
		staff[1]= new KlasaEmployee2("Izabela Franczyk", 70000, 1994, 9, 10);
		
		for (KlasaEmployee2 e : staff)
			e.raiseSalary(5);
		
		for (KlasaEmployee2 e :staff)
			System.out.println("name = " + e.getName() + ", salary= " + e.salary + ", hireDay = " + e.getHireDay());
		
	

		for (KlasaEmployee2 e :staff)
		{	e.setId();
	
			System.out.println("id = " + e.getId());}
		System.out.println("nastepne id = " + KlasaEmployee2.getNextId());
	}
}
		
		
		
