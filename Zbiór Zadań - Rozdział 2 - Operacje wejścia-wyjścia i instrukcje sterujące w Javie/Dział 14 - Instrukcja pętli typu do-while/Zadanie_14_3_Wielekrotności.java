import java.util.Scanner;

public class Zadanie_14_3_Wielekrotno�ci
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int liczba = 1;
		int wielokrotno�� = 1;
		do
		{
			System.out.println(liczba);
			liczba = 7 * (wielokrotno��);
			
			wielokrotno��++;

		} while (liczba < 100);

	}

}
