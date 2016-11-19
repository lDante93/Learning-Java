import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie_17_1_ScannerLiczba
{

	public static void main(String args[])
	{
		System.out.println("Wczytywanie liczb");
		Scanner input = new Scanner(System.in);
		double x = 0.0;
		while (true)
		{
			try
			{
				x = input.nextDouble();
				break;
			} catch (InputMismatchException e)
			{
				System.out.printf("z³a liczba");
				input.next();
			}
		}
		input.close();
		System.out.printf("Wprowadzona liczba, x = %f\n", x);

	}
}
