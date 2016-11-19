import java.util.Scanner;

public class Zadanie_16_7_Silnia
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
int suma = 1;
		int n = input.nextInt();

		for (int i = 1; i < 6; i++)
			suma = suma *i;
			System.out.println(suma);
	}
}
