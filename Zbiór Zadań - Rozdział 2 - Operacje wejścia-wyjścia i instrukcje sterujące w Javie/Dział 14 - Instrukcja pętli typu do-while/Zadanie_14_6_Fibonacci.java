import java.util.Scanner;

public class Zadanie_14_6_Fibonacci
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a = 1, b = 1; // Dwa pierwsze wyrazy cigu
		System.out.print(a + ", " + b);
		int c = a + b;
		// Kolejny wyraz cigu
		do
		{
			System.out.print(", " + c);
			a = b;
			b = c;
			c = a + b;
		} while (c < 1000);
		System.out.println(".");

	}

}
