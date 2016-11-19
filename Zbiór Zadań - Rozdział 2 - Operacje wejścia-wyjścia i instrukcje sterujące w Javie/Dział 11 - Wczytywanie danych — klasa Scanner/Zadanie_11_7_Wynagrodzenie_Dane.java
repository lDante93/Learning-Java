import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie_11_7_Wynagrodzenie_Dane
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File f = new File("dane.txt");
		Scanner input = new Scanner(f);

		String imie = input.next();
		String nazwisko = input.next();
		int godziny = input.nextInt();
		int stawka = input.nextInt();

		// int godzinyInt=Integer.parseInt(godziny);
		// int stawkaInt=Integer.parseInt(stawka);
		int wynagrodzenie = godziny * stawka;

		System.out.printf("Imiê: %s\n Nazwisko: %s Godziny: %d Stawka %d Wynagrodzenie %d", imie, nazwisko, godziny,
				stawka, wynagrodzenie);
	}
}
