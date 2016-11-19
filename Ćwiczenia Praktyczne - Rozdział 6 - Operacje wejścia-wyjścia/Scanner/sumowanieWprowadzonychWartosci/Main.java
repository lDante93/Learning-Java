package sumowanieWprowadzonychWartosci;

import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int suma=0;
		while (input.hasNextInt())
		{
			int liczba = input.nextInt();
			suma=suma+liczba;

		}

		System.out.println(suma);
	}
}
