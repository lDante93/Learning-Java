import java.util.Scanner;

public class Zadanie_13_8_Max2Min
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj a ");
		int a = input.nextInt();
		System.out.println("Podaj b ");
		int b = input.nextInt();
		System.out.println("Podaj c");
		int c = input.nextInt();

		if (a > b)
		{
			if (b > c)
			{
				
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
		
			}
			else{
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);
			}
		}
		else if (b > a)
		{
			if (a > c)
			{
			
					System.out.println(b);
					System.out.println(a);
					System.out.println(c);
				
				
			}
			else
			{
				System.out.println(b);
				System.out.println(c);
				System.out.println(a);
			}
		}
		
		else if (c > a)
		{
			if (a > b)
			{
			
					System.out.println(c);
					System.out.println(a);
					System.out.println(b);
				
				
			}
			else
			{
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}
		}
	}
}