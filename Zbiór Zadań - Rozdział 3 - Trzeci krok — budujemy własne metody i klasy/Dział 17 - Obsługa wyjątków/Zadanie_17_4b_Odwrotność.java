import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie_17_4b_Odwrotno��
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
				double odwrotno�� = 1.0 / liczba;

				System.out.println(odwrotno��);
			}
		} else
		{

			System.out.println("Podaj liczb� ca�kowit�");
		}

	}
}
