

public class Zadanie_5_2_Osoba
{

	public static void main(String[] args)
	{
		String imiê = args[0];
		String nazwisko = args[1];
		
		
	
		
			System.out.println("Nazwisko: "+Character.toUpperCase(nazwisko.charAt(0))+nazwisko.substring(1));
			System.out.println("Imiê: "+Character.toUpperCase(imiê.charAt(0))+imiê.substring(1));
			System.out.println("Imiê: "+Character.toUpperCase(imiê.charAt(0))+imiê.substring(1));
			System.out.println("Nazwiskoi imiê: "+nazwisko.toUpperCase()+" "+Character.toUpperCase(imiê.charAt(0))+imiê.substring(1));
			System.out.println("Inicja³y: "+Character.toUpperCase(imiê.charAt(0))+Character.toUpperCase(nazwisko.charAt(0)));
			System.out.println("Login: "+Character.toUpperCase(nazwisko.charAt(0))+Character.toUpperCase(nazwisko.charAt(1))+imiê.substring(0,3));

	}

}
