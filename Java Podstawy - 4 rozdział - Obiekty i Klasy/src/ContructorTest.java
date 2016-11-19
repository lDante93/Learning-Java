import java.util.Date;
import java.util.GregorianCalendar;

public class ContructorTest {

			// TODO Auto-generated method stub

	public static void main(String[] args) {
		
	
	Employee[] staff = new Employee[3];
	staff[0]= new Employee("£ukasz", 100000);
	staff[1]= new Employee(70000);
	staff[2]= new Employee();
	
	
	for(Employee e:staff)
	System.out.println("name="+e.getName()+",id="+e.getId()+".salary="+e.getSalary());
	
}

}	


