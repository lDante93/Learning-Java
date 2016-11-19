import java.util.Scanner;

public class Zadanie_13_2_PoleObwód
{
	public static void main(String args[])
	{
		System.out.println("Obliczanie pola powierzchni i obwodu kwadratu");
		Scanner input = new Scanner(System.in);
		System.out.print("Podaj dugo boku, a = ");
		double a = input.nextDouble();
		input.close();
		if (a > 0)
		{
			double pole = a * a;
			double obwod = 4 * a;
			System.out.println("Pole powierzchni P = " + pole);
			System.out.println("Obwód kwadratu L = " + obwod);
		}
		if (a <= 0)
			System.out.println("Bd! Dugo boku ma by liczb dodatni.");
	}
}