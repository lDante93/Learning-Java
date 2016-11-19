

public class Zadanie_3_3_programowanie
{

	public static void main(String[] args)
	{
		char tablica[] = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e' };

		tablica[0]='P';
		System.out.println(tablica);
		for (char e : tablica)
		{
			System.out.print(Character.toUpperCase(e));

		}
		
	}

		
}
