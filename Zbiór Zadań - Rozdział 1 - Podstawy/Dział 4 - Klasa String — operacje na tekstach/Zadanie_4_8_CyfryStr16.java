

public class Zadanie_4_8_CyfryStr16
{
	public static void main(String args[])
	{
		char tablica[] = new char[16];
		for (int i = 0; i < tablica.length; i++)
		{
			tablica[i] = Character.forDigit(i, 16);
		}

		String �a�cuch = new String(tablica);
		System.out.println(tablica);
		System.out.println(�a�cuch);
	}
}