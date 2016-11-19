package zadanie_86;

public class Test
{

	public static void main(String[] args)
	{
		Data dataEgz=new Data(21,1,2005,"EN");
		Data dataUrodzin=new Data(10,4,1984);
		System.out.println(dataEgz);
		System.out.println(dataUrodzin);
		dataUrodzin.zmienStyl("EN");
		System.out.println(dataUrodzin);
		dataUrodzin.zmienDzien(29);
		dataUrodzin.zmienMiesiac(2);
		dataUrodzin.zmienRok(1900);
		System.out.println("Czy siê uda? "+dataUrodzin);
		dataUrodzin.zmienStyl("PL");
		System.out.println("Czy siê uda? "+dataUrodzin);
		
	}

}
