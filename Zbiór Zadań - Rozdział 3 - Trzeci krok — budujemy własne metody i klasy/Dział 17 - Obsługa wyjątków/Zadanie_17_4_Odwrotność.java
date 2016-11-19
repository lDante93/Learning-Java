import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie_17_4_Odwrotno��
{

	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);

		try{
			int liczba = input.nextInt();
			
			if (liczba!=0){
			double odwrotno�� = 1.0/liczba;
			
			System.out.println(odwrotno��);	}
			else if(liczba ==0)
			{
				throw new ArithmeticException("Podaj liczb� nie rowna 0");
			}
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Podaj liczb� ca�kowit�");	
		}		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
