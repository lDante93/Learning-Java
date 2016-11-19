import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie_17_3_Suma
{

	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);
		int suma = 0;
		int licznik = 0;
		int n = 0;
		do
		{
			try
			{
				double s = input.nextDouble();
				n = (int) (s);
				++licznik;
				suma += n;

			} catch (InputMismatchException e)
			{
				System.out.println("NOOB");
				input.next();

			}
		} while (licznik < 5);
		// input.close();
		System.out.print(suma);
	}
}
