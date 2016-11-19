import java.util.Scanner;

public class Zadanie_13_1_P³eæ
{

	public static void main(String[] args)
	{
		System.out.println("Jak masz na imiê?");
		Scanner input = new Scanner(System.in);
		String imiê = input.nextLine();
		int litera = imiê.charAt(imiê.length()-1);
		boolean check = litera=='a';
		if(check)
		{
			System.out.println(imiê+" jest kobiet¹");
		}
		else
		{
			System.out.println(imiê+" jest mê¿czyzn¹");
		}
	}

}
