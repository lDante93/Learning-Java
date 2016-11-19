package zadanie_2_1;

public class Firma
{

	public static void main(String[] args)
	{
		Pracownik pracownik1 = new Pracownik();
		Pracownik pracownik2 = new Pracownik();
		
		pracownik1.imiê="£ukasz";
		pracownik2.imiê="Iza";
		pracownik1.nazwisko="Franczyk";
		pracownik2.nazwisko="Stawowczyk";
		pracownik1.wiek=23;
		pracownik2.wiek=22;
		
		
		System.out.println(pracownik1.imiê+" "+pracownik1.nazwisko+" "+ pracownik1.wiek);
		System.out.println(pracownik2.imiê+" "+pracownik2.nazwisko+" "+ pracownik2.wiek);
	}

}
