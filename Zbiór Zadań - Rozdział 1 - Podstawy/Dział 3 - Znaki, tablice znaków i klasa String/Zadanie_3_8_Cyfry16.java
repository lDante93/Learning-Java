
import static java.lang.System.*;

public class Zadanie_3_8_Cyfry16
{

	public static void main(String[] args)
	{
		char tablica[] = new char[16];
		char tablica2[] = new char[16];
		for (int i = 0; i < tablica.length; i++)
		{
			if (i < 10)
			{
				tablica[i] = (char) (i + 48);

				System.out.println(tablica[i]);
			} else if (i >= 10)
			{
				tablica[i] = (char) (i + 55);

				System.out.println(tablica[i]);
			}

		}
		System.out.println("\n");

		for (int i = 0; i < tablica2.length; i++)
		{
			char znak = Character.forDigit(i, 16);
			System.out.println(znak);
		}
	}
}
