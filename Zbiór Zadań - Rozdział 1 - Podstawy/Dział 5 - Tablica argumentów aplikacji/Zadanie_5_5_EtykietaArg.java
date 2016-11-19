

public class Zadanie_5_5_EtykietaArg
{

	public static void main(String[] args)
	{
		String imiê = args[0];
		String nazwisko = args[1];
		int dlugosc = imiê.length() + nazwisko.length() + 5;
		int x = 0;
		while (x < dlugosc)
		{
			System.out.print("*");

			x++;
		}

		x = 0;
		System.out.println("");
		System.out.print("* ");
		System.out.print(imiê);
		System.out.print(" ");
		System.out.print(nazwisko);
		System.out.println(" *");
		while (x < dlugosc)
		{
			System.out.print("*");

			x++;
		}

	}

}
