

public class Zadanie_5_2_Osoba
{

	public static void main(String[] args)
	{
		String imi� = args[0];
		String nazwisko = args[1];
		
		
	
		
			System.out.println("Nazwisko: "+Character.toUpperCase(nazwisko.charAt(0))+nazwisko.substring(1));
			System.out.println("Imi�: "+Character.toUpperCase(imi�.charAt(0))+imi�.substring(1));
			System.out.println("Imi�: "+Character.toUpperCase(imi�.charAt(0))+imi�.substring(1));
			System.out.println("Nazwiskoi imi�: "+nazwisko.toUpperCase()+" "+Character.toUpperCase(imi�.charAt(0))+imi�.substring(1));
			System.out.println("Inicja�y: "+Character.toUpperCase(imi�.charAt(0))+Character.toUpperCase(nazwisko.charAt(0)));
			System.out.println("Login: "+Character.toUpperCase(nazwisko.charAt(0))+Character.toUpperCase(nazwisko.charAt(1))+imi�.substring(0,3));

	}

}
