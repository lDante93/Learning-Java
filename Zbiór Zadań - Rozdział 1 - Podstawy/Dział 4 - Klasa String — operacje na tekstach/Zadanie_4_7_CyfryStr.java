

public class Zadanie_4_7_CyfryStr
{
	public static void main(String args[])
	{
		char tablica[] = new char[10];
		for (int i = 0; i < tablica.length; i++)
		{
			tablica[i] = (char) (i + 48);
		}

		String ³añcuch = new String(tablica);
		System.out.println(tablica);
		System.out.println(³añcuch);
	}
}