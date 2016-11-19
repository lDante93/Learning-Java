import java.util.Scanner;

public class Zadanie_14_7_Fibonacci2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = 1, b = 1; // Dwa pierwsze wyrazy cigu
		System.out.print(a + ", " + b);
		int c = a + b;
		int i =2;
		// Kolejny wyraz cigu
		do
		{
			System.out.print(", " + c);
			a = b;
			b = c;
			c = a + b;
			i++;
		} while (c < n);
		System.out.println(".");
		System.out.print(i);

	}

}
