import java.util.Scanner;

public class Zadanie_11_2_Fahrenheit2Celsjusz
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double fahrenheit = input.nextDouble();
		double celsjusz = (fahrenheit - 32)/ 1.8 ;
		System.out.printf("%.1f", celsjusz);
	}
}
