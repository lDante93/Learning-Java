import java.util.Scanner;

public class Zadanie_14_4_PoleKo³a
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double r ;
		double pole ;
		do
		{
			r = input.nextDouble();
			
			if(r<=0)
				System.out.println("B³¹d");

		} while (r <=0 );

		pole = Math.PI*r*r;
		System.out.println(pole);
	}

}
