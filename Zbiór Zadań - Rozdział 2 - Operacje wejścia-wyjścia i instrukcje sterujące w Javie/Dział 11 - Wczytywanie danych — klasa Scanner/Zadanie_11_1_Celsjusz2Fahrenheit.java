import java.util.Scanner;

public class Zadanie_11_1_Celsjusz2Fahrenheit
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double celsjusz = input.nextDouble();
		double fahrenheit = celsjusz * 1.8 + 32;
		System.out.printf("%.1f", fahrenheit);
	}
}
