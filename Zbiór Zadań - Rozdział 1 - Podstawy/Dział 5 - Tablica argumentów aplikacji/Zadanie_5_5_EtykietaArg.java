

public class Zadanie_5_5_EtykietaArg
{

	public static void main(String[] args)
	{
		String imi� = args[0];
		String nazwisko = args[1];
		int dlugosc = imi�.length() + nazwisko.length() + 5;
		int x = 0;
		while (x < dlugosc)
		{
			System.out.print("*");

			x++;
		}

		x = 0;
		System.out.println("");
		System.out.print("* ");
		System.out.print(imi�);
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
