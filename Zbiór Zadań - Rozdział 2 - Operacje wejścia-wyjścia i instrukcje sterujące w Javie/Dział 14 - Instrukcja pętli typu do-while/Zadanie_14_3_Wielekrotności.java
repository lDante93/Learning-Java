import java.util.Scanner;

public class Zadanie_14_3_Wielekrotności
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int liczba = 1;
		int wielokrotność = 1;
		do
		{
			System.out.println(liczba);
			liczba = 7 * (wielokrotność);
			
			wielokrotność++;

		} while (liczba < 100);

	}

}
