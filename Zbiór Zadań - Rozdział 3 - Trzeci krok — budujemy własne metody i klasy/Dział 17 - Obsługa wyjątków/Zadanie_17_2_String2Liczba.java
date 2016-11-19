import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie_17_2_String2Liczba
{

	public static void main(String args[])
	{
		System.out.println("Wczytywanie liczb");
		Scanner input = new Scanner(System.in);
		String s;
		double l;

		while(true)
		{
		try
		{
			s = input.next();

			l = Double.parseDouble(s);
			System.out.println(l);
		} catch (NumberFormatException e)
		{
			System.out.println("NOOB");
			
		}
		}
	}
}
