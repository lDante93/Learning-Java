import java.util.Scanner;

public class Zadanie_13_1_P�e�
{

	public static void main(String[] args)
	{
		System.out.println("Jak masz na imi�?");
		Scanner input = new Scanner(System.in);
		String imi� = input.nextLine();
		int litera = imi�.charAt(imi�.length()-1);
		boolean check = litera=='a';
		if(check)
		{
			System.out.println(imi�+" jest kobiet�");
		}
		else
		{
			System.out.println(imi�+" jest m�czyzn�");
		}
	}

}
