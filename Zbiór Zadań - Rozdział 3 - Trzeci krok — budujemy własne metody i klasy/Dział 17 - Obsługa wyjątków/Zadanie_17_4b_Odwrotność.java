import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie_17_4b_Odwrotnoœæ
{

	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);

		int liczba = 0;

		if (input.hasNextInt())
		{
			liczba=input.nextInt();
			if (liczba == 0)
			{
				System.out.println("dales 0");
			} else if (liczba != 0)
			{
			;
				double odwrotnoœæ = 1.0 / liczba;

				System.out.println(odwrotnoœæ);
			}
		} else
		{

			System.out.println("Podaj liczbê ca³kowit¹");
		}

	}
}
