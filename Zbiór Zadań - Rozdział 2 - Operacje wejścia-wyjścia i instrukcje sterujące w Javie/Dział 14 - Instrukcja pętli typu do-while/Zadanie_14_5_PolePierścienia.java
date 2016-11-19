import java.util.Scanner;

public class Zadanie_14_5_PolePierœcienia
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double r, r2 ;
		double pole, pole2;
		do
		{
			r = input.nextDouble();
			
			if(r<=0)
				System.out.println("B³¹d");

			r2 = input.nextDouble();
			if(r<=0)
				System.out.println("B³¹d");
		} while (r <=0 ||r2<=0);

		pole = Math.PI*r*r;
		pole2 = Math.PI*r2*r2;
		System.out.println(pole-pole2);
	}

}
