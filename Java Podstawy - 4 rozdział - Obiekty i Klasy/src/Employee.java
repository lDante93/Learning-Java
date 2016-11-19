import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Employee {

			// TODO Auto-generated method stub
	private static int nextId = 1;
	private int id;
	private String name ="sad";
	public double salary=55;
static{
	Random generator = new Random();
	nextId=generator.nextInt(10000);
}

{
	id=nextId;
	nextId++;
}

		public Employee(String n, double s)
		{
			name = n;
			salary = s;
		}	
		public Employee(double s)
		{
			this("Employee #"+nextId,s);
		}
		public Employee()
		{
			
		}	
		
			public String getName()
			{
				return name;
			}
			
			public double getSalary()
			{
				return salary;
			}
			
			
			public int getId()
			{
				return id;
			}

			

			
		}
	
		


