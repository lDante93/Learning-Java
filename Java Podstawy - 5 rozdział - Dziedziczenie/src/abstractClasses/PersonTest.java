package abstractClasses;



public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] people = new Person[2];
		people[0] = new Employee("Izabela Stawowczyk", 80000, 1989, 10, 1);		
		people[1] = new Student("Daniel Pawlik", "£ukasz Rojszczak");
		
		for (Person p :people)
			System.out.println(p.getName()+", "+p.getDescription());
	}

}
