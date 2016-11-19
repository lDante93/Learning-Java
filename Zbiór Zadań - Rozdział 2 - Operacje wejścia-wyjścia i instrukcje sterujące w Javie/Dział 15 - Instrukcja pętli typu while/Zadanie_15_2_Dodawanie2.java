import java.util.Scanner;

public class Zadanie_15_2_Dodawanie2
{

	public static void main(String args[])
	{
		/* Wprowadzanie danych. */
		System.out.println("Podaj dwie liczby naturalne:");
		Scanner input = new Scanner(System.in);
		int m, n;
		
			System.out.print("m = ");
			m = input.nextInt();
		
		
			System.out.print("n = ");
			n = input.nextInt();
		 
		input.close();
		/* Obliczenia i wynik. */
		if(n>0){
		while (n > 0)
		{
			--n; // Zmniejszamy n o 1.
			++m; // Zwiêkszamy m o 1.
		}
		}
		else if(n<0)
			while (n < 0)
			{
				++n; // Zmniejszamy n o 1.
				--m; // Zwiêkszamy m o 1.
			}
	
		System.out.printf("Suma liczb %d\n", m);
	}
}