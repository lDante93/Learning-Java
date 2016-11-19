package uzycieKlasyScanner;

import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int liczba;
		while (!input.hasNextInt())
		{
			
			System.out.println("B³¹d");
			input.next();

		}
		liczba = input.nextInt();
		System.out.println(liczba);
	}
}
