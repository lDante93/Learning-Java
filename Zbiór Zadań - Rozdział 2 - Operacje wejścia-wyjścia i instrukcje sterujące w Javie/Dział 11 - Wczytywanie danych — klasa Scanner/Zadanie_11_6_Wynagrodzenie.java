import java.util.Scanner;

public class Zadanie_11_6_Wynagrodzenie
{
	public static void main(String[] args)
	{
		 Scanner input = new Scanner(System.in);
		
		String imie = input.next();
		String nazwisko = input.next();
		int godziny= input.nextInt();
		int stawka = input.nextInt();
		
	//	int godzinyInt=Integer.parseInt(godziny);
	//	int stawkaInt=Integer.parseInt(stawka);
		int wynagrodzenie = godziny*stawka;
		
		System.out.printf("Imi�: %s\n Nazwisko: %s Godziny: %d Stawka %d Wynagrodzenie %d", imie,nazwisko,godziny,stawka,wynagrodzenie);
	}
}
