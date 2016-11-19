import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie_17_4_Odwrotnoœæ
{

	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);

		try{
			int liczba = input.nextInt();
			
			if (liczba!=0){
			double odwrotnoœæ = 1.0/liczba;
			
			System.out.println(odwrotnoœæ);	}
			else if(liczba ==0)
			{
				throw new ArithmeticException("Podaj liczbê nie rowna 0");
			}
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Podaj liczbê ca³kowit¹");	
		}		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
