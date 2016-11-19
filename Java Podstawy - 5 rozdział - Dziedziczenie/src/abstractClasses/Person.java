package abstractClasses;



public abstract class Person {

	public abstract String getDescription();
	private String name;
	private int x;
	
	public Person(String n)
	{
		name = n;
		
	}

	public String getName()
	{
		return name;
	}
	
}
