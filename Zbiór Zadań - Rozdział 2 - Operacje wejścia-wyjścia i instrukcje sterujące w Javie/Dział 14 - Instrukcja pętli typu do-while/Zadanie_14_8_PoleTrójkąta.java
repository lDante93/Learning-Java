import java.util.Scanner;

public class Zadanie_14_8_PoleTr�jk�ta
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double a;
		double pole;
		do
		{
			a = input.nextDouble();
			if(a>0)
			{pole = (a * a * Math.sqrt(3)) / 4;
			System.out.println(pole);}
			else if(a<0)
			{
				System.out.println("Podaj warto�� dodatni�");
			}
		} while (a != 0);

	}

}
