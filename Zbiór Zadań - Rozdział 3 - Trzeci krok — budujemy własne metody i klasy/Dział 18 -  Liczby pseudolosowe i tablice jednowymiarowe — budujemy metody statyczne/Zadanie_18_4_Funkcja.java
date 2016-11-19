import java.util.Scanner;

public class Zadanie_18_4_Funkcja
{

	static double rand(int y)
	{
		int b = y;
		return Math.random() * b;
	}

	public static void main(String[] args)
	{
		int a, b;
		double liczba;
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj a: ");
		int x = input.nextInt();
		System.out.println("Podaj b: ");
		int y = input.nextInt();

		do
		{
			liczba = rand(y);
		} while (liczba < x);
		System.out.printf("%.1f", liczba);
		input.close();
	}

}
