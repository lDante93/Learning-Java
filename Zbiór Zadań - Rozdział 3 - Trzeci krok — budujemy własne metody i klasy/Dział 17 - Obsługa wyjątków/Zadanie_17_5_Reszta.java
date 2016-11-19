import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie_17_5_Reszta
{

	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);


		
		try{
			int a = input.nextInt();
			int b = input.nextInt();
			int reszta = a%b;
			
			System.out.println(reszta);	
			
		}
		catch(InputMismatchException e)
		
		{
			System.out.println("to nie l czalkowita");
		}
	catch(ArithmeticException e)
		
		{
			System.out.println("nie daj 0");
		}
		finally{
			System.out.println("dada2");
		}
		System.out.println("dada");
	}
}
