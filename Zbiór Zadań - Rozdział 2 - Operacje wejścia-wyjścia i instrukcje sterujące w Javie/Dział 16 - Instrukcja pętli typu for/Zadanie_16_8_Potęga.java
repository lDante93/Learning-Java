import java.util.Scanner;

public class Zadanie_16_8_Potêga
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj a:");
		int a = input.nextInt();
		System.out.println("Podaj n:");
		int n = input.nextInt();
		int iloczyn = 1;

		if (n == -1)
		{
			System.out.println("end");
		} else
		{

		}
		for (int i = 0; i < n; i++)
			iloczyn = iloczyn * a;
		System.out.println(iloczyn);
	}
}
