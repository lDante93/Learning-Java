import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class ParamTest {

	public static void main(String[] args) {

System.out.println("Testowanie tripleValue:");
double percent = 10;
System.out.println("Przed: percent =" + percent);


tripleValue(percent);
System.out.println("Po: percent=" +percent);
		


System.out.println("\n Testiwabue tripleSalary:");
KlasaEmployee2 harry = new KlasaEmployee2("Grzegorz", 50000,0000,0000,0000);
System.out.println("Przed Salary=" + harry.getSalary());
tripleSalary(harry);
System.out.println("Po: salary = " + harry.getSalary());



System.out.println("\nTestowanie swap:");
KlasaEmployee2 a = new KlasaEmployee2("Alicja", 70000,0000,0000,0000);	
KlasaEmployee2 b = new KlasaEmployee2("Grzegorz", 60000,0000,0000,0000);
System.out.println("Przed: a="+a.getName());
System.out.println("Przed: b="+b.getName());
swap(a,b);
System.out.println("Po: a="+a.getName());
System.out.println("Po: b="+a.getName());

	}
	
	public static void tripleValue(double x)		
	{
		x = 3* x;
		System.out.println("Koniec metody: x=" + x);
	}
	
	public static void tripleSalary(KlasaEmployee2 x)		
	{
		x.raiseSalary(200);
		System.out.println("Koniec metody: salary=" + x.getSalary());
	}
	public static void swap(KlasaEmployee2 x, KlasaEmployee2 y)		
	{
		KlasaEmployee2 temp = x;
	x=y;
	y=temp;
	System.out.println("Koniec metody: x="+x.getName());
	System.out.println("Koniec metody: y="+y.getName());
	}
	
}
		
		
		
