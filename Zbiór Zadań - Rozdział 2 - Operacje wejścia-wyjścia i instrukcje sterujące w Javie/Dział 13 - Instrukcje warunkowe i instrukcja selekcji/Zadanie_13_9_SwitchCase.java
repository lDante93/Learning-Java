import java.util.Scanner;

public class Zadanie_13_9_SwitchCase
{
	public static void main(String args[])
	{
		System.out.println("S³owny zapis liczby dwucyfrowej");
		Scanner input = new Scanner(System.in);
		System.out.print("Podaj liczbê naturaln¹ dwucyfrow¹, n = ");
		int n = input.nextInt();
		StringBuilder wynik = new StringBuilder("S³ownie: ");
		if (n >= 0 && n < 10)
		{
			switch (n)
			{
			case 0:
				wynik.append("zero");
				break;
			case 1:
				wynik.append("jeden");
				break;
			case 2:
				wynik.append("dwa");
				break;
			case 3:
				wynik.append("trzy");
				break;
			case 4:
				wynik.append("cztery");
				break;
			case 5:
				wynik.append("piêæ");
				break;
			case 6:
				wynik.append("szeœæ");
				break;
			case 7:
				wynik.append("siedem");
				break;
			case 8:
				wynik.append("osiem");
				break;
			case 9:
				wynik.append("dziewiêæ");
				break;
			}
			System.out.println(wynik.append("."));
		} else if (n >= 10 && n < 20)
		{
			switch (n)
			{
			case 10:
				wynik.append("dziesiêæ");
				break;
			case 11:
				wynik.append("jedenaœcie");
				break;
			case 12:
				wynik.append("dwanaœcie");
				break;
			case 13:
				wynik.append("trzynaœcie");
				break;
			case 14:
				wynik.append("czternaœcie");
				break;
			case 15:
				wynik.append("piêtnaœcie");
				break;
			case 16:
				wynik.append("szesnaœcie");
				break;
			case 17:
				wynik.append("siedemnaœcie");
				break;
			case 18:
				wynik.append("osiemnaœcie");
				break;
			case 19:
				wynik.append("dziewiêtnaœcie");
				break;
			}
			System.out.println(wynik.append("."));
		} else if (n >= 20 && n < 100)
		{
			switch (n / 10)
			{

			case 2:
				wynik.append("dwadzieœcia");
				break;
			case 3:
				wynik.append("trzydzieœci");
				break;
			case 4:
				wynik.append("czterdzieœci");
				break;
			case 5:
				wynik.append("piêædziesi¹t");
				break;
			case 6:
				wynik.append("szeœædziesi¹t");
				break;
			case 7:
				wynik.append("siedemdziesi¹t");
				break;
			case 8:
				wynik.append("osiemdziesi¹t");
				break;
			case 9:
				wynik.append("dziewiêædziesi¹t");
				break;
			}
			
			int d = n % 10; // Cyfra jednoci if (d > 0) {
			if (d > 0)
			{
				wynik.append(" ");
				switch (d)
				{
				case 1:
					wynik.append("jeden");
					break;
				case 2:
					wynik.append("dwa");
					break;
				case 3:
					wynik.append("trzy");
					break;
				case 4:
					wynik.append("cztery");
					break;
				case 5:
					wynik.append("pi");
					break;
				case 6:
					wynik.append("sze");
					break;
				case 7:
					wynik.append("siedem");
					break;
				case 8:
					wynik.append("osiem");
					break;
				case 9:
					wynik.append("dziewi");
					break;
				}
				System.out.println(wynik.append("."));
			}
			else{
				System.out.println(wynik.append("."));
			}

		} else
			System.out.println("B³êdna wartoœæ liczby!");

	}
}
