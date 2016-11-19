
public class Zadanie_18_3_SumaRandom
{

	public static void main(String[] args)
	{
		int i = 1;
		int liczba, liczba2, suma = 0;
		int tab[] = new int[13];

		do
		{
			liczba = 1 + (int) (Math.random() * 6);
			liczba2 = 1 + (int) (Math.random() * 6);
			suma = liczba + liczba2;
			System.out.println(i + " " + liczba + " " + liczba2 + "    " + suma);

			tab[suma] = tab[suma] + suma;

			i++;
		} while (i <= 3000);

		for (int j=1;j<tab.length;j++)
		{
			System.out.println(j+"   "+tab[j]);
		}

	}
}
