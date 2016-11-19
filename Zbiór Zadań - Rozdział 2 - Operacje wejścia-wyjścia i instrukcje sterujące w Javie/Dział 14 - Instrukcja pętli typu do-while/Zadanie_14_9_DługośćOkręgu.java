import java.util.Scanner;

public class Zadanie_14_9_D³ugoœæOkrêgu
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double r, dlugosc;
		boolean znak;
		do
		{
			r = input.nextDouble();
			
			dlugosc = 2*Math.PI*r;
			System.out.println(dlugosc);
			
			
				System.out.println("Czy obliczamy dalej?");
				znak = input.nextBoolean();
		} while (znak);

	}

}
