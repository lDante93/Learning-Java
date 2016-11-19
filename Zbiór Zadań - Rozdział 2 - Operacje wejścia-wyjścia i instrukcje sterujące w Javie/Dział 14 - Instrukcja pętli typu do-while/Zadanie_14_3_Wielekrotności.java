import java.util.Scanner;

public class Zadanie_14_3_Wielekrotnoœci
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int liczba = 1;
		int wielokrotnoœæ = 1;
		do
		{
			System.out.println(liczba);
			liczba = 7 * (wielokrotnoœæ);
			
			wielokrotnoœæ++;

		} while (liczba < 100);

	}

}
