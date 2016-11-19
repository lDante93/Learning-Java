
import static java.lang.System.*;

public class Zadanie_3_7_Cyfry
{

	public static void main(String[] args)
	{
		char tablica[] = new char[10];
		for (int i = 0; i < tablica.length; i++)
		{
			tablica[i] = (char) (i+48);

			System.out.println(tablica[i]);

		}
	}
}