import java.util.Scanner;

public class Zadanie_16_2_Palindrom
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String wyraz = input.nextLine();
		char c_arr[] = wyraz.toCharArray();
		char c_arrWspak[] = new char[10];
		StringBuilder wspak = new StringBuilder();
		for (int i = c_arr.length - 1; i >= 0; i--)
		{
			wspak.append(c_arr[i]);
		}
		System.out.println(wspak);
String wspak2= wspak.toString();
		if (wyraz.equals(wspak2))
		{
			System.out.println("jest");
		} else
		{
			System.out.println("nie jest");
		}
	}

}
