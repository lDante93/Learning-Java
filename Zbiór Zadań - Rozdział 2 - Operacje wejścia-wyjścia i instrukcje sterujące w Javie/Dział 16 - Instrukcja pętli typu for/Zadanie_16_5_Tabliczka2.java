import java.util.Scanner;

public class Zadanie_16_5_Tabliczka2
{

	public static void main(String[] args)
	{

		System.out.printf("%4c", '.');
		for (int j = 0; j < 5; j++)
		{

			System.out.printf("%4d", j);

		}
		System.out.printf("%4d", 10);
		System.out.println();
		for (int j = 0; j < 7; j++)
			System.out.printf("%4d", 0);
		System.out.println();
		
		for (int i = 1; i < 6; i++)
		{if(i<5){
			System.out.printf("%4d%4d", i, 0);
		}
		else{
			System.out.printf("%4d%4d", 10, 0);
		}
			for (int j = 1; j < 6; j++)
			{

				System.out.printf("%4s", Integer.toString(j*i, 5));

			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.printf("%4c", '.');
		for (int j = 0; j < 5; j++)
		{

			System.out.printf("%4d", j);

		}
		System.out.printf("%4d", 10);
		System.out.println();
		for (int j = 0; j < 7; j++)
			System.out.printf("%4d", 0);
		System.out.println();
		
		for (int i = 1; i < 6; i++)
		{if(i<5){
			System.out.printf("%4d%4d", i, 0);
		}
		else{
			System.out.printf("%4d%4d", 10, 0);
		}
			for (int j = 1; j < 6; j++)
			{

				System.out.printf("%4s", Integer.toString(j+i, 5));

			}
			System.out.println();
		}
	}
}
