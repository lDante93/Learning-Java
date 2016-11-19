import java.util.Scanner;

public class Zadanie_14_2_Suma2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int liczba;
		int suma = 0;
		do
		{
			liczba = input.nextInt();
			if (liczba > 0)
			{
				suma = suma + liczba;
				System.out.println(suma);
			} else
			{
				System.out.println("Podaj dodatni¹ liczbê");
			}

		} while (liczba != 0);

	}

}
