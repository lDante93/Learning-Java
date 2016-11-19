import java.util.Scanner;

public class Zadanie_16_1_KwadratLiczby
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int kwadrat=0;

		for (int i = 1; kwadrat < n*n; i = i + 2)
		{
			kwadrat=kwadrat+i;
		}
		System.out.println(kwadrat);
	}

}
