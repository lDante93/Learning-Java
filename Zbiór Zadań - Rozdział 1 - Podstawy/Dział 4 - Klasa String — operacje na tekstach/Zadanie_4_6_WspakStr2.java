

public class Zadanie_4_6_WspakStr2
{
	public static void main(String args[])
	{
		String napis = "programowanie";
		char[] tablica = napis.toCharArray();
		char temp;
		for (int i = 0, j = tablica.length - 1; i < j; i++, j--)
		{
			temp = tablica[i];
			tablica[i] = tablica[j];
			tablica[j] = temp;

		}
		 napis = new String(tablica);
		System.out.println(napis);
	}
}