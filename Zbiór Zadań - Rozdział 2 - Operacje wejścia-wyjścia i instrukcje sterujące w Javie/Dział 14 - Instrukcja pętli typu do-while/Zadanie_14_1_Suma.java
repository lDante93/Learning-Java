import java.util.Scanner;

public class Zadanie_14_1_Suma
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int liczba;
		int suma = 0;
		do
		{
			liczba = input.nextInt();
			suma = suma + liczba;
			System.out.println(suma);

		} while (liczba != 0);

	}

}
