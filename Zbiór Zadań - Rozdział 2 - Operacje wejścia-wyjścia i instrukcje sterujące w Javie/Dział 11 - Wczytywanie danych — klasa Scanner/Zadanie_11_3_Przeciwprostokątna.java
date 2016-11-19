import java.util.Scanner;

public class Zadanie_11_3_Przeciwprostok¹tna
{
	public static void main(String[] args)
	{
		// Scanner input = new Scanner(System.in);
		// double a = input.nextDouble();
		// double b = input.nextDouble();
		// double c = Math.sqrt((Math.pow(a, 2)+(Math.pow(b, 2))));
		// System.out.printf("%.3f", c);

		Scanner input = new Scanner(System.in);
		System.out.print("Podaj dugo przyprostoktnej, a = ");
		double a = input.nextDouble();
		System.out.print("Podaj miar kta ostrego (°), alfa = ");
		double alfa = input.nextDouble();
		double c = a / Math.sin(Math.toRadians(alfa));
		System.out.printf("Dugo przeciwprostoktnej c = %.3f\n", c);
		;

	}
}
