

public class Zadanie_3_2_Informatyka
{

	public static void main(String[] args)
	{
		char tablica[] = { 'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'y', 'k', 'a' };

		for (char e : tablica)
		{
			System.out.println(e);

		}

		for (char e : tablica)
		{
			System.out.print(e + " ");
		}
		System.out.println("");
		for (char e : tablica)
		{

			System.out.print(Character.toLowerCase(e));
		}
		System.out.println("");
		for (char e : tablica)
		{
			System.out.print(Character.toUpperCase(e));

		}
		System.out.println("");

		String tablicawyraz = new String(tablica);
		System.out.println(tablicawyraz.toUpperCase());
		System.out.println(tablicawyraz.toLowerCase());
	}

}
