import java.util.Scanner;

public class Zadanie_13_9_SwitchCase
{
	public static void main(String args[])
	{
		System.out.println("S�owny zapis liczby dwucyfrowej");
		Scanner input = new Scanner(System.in);
		System.out.print("Podaj liczb� naturaln� dwucyfrow�, n = ");
		int n = input.nextInt();
		StringBuilder wynik = new StringBuilder("S�ownie: ");
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
				wynik.append("pi��");
				break;
			case 6:
				wynik.append("sze��");
				break;
			case 7:
				wynik.append("siedem");
				break;
			case 8:
				wynik.append("osiem");
				break;
			case 9:
				wynik.append("dziewi��");
				break;
			}
			System.out.println(wynik.append("."));
		} else if (n >= 10 && n < 20)
		{
			switch (n)
			{
			case 10:
				wynik.append("dziesi��");
				break;
			case 11:
				wynik.append("jedena�cie");
				break;
			case 12:
				wynik.append("dwana�cie");
				break;
			case 13:
				wynik.append("trzyna�cie");
				break;
			case 14:
				wynik.append("czterna�cie");
				break;
			case 15:
				wynik.append("pi�tna�cie");
				break;
			case 16:
				wynik.append("szesna�cie");
				break;
			case 17:
				wynik.append("siedemna�cie");
				break;
			case 18:
				wynik.append("osiemna�cie");
				break;
			case 19:
				wynik.append("dziewi�tna�cie");
				break;
			}
			System.out.println(wynik.append("."));
		} else if (n >= 20 && n < 100)
		{
			switch (n / 10)
			{

			case 2:
				wynik.append("dwadzie�cia");
				break;
			case 3:
				wynik.append("trzydzie�ci");
				break;
			case 4:
				wynik.append("czterdzie�ci");
				break;
			case 5:
				wynik.append("pi��dziesi�t");
				break;
			case 6:
				wynik.append("sze��dziesi�t");
				break;
			case 7:
				wynik.append("siedemdziesi�t");
				break;
			case 8:
				wynik.append("osiemdziesi�t");
				break;
			case 9:
				wynik.append("dziewi��dziesi�t");
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
			System.out.println("B��dna warto�� liczby!");

	}
}
