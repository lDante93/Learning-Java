import java.util.Scanner;

public class Zadanie_13_3_Zbiór
{

	public static void main(String args[])
	{
		System.out.println("Podaj dwie liczby a i b:");
		Scanner input = new Scanner(System.in);
		System.out.print("a = ");
		double a = input.nextDouble();
		System.out.print("b = ");
		double b = input.nextDouble();
		input.close();
		StringBuilder wynik = new StringBuilder();
		if (a < b)
			wynik.append("<").append(a).append(", ").append(b).append(">");
		else if (b < a)
			wynik.append("<").append(b).append(", ").append(a).append(">");
		else
			wynik.append("{").append(a).append("}");
		wynik.insert(0, "Zbiór wszystkich liczb zawartych pomidzy a i b, X = ");
		System.out.println(wynik);
	}
}
