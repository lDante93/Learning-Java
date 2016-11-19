import java.util.Scanner;

public class Zadanie_16_6_Ci¹gHarmoniczny
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=1; i<n; i++)
			System.out.println(1.0/i);
	}
}
