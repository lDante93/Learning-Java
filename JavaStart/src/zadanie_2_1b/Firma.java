package zadanie_2_1b;

public class Firma
{

	public static void main(String[] args)
	{
		Pracownik pracownik1 = new Pracownik();
		Pracownik pracownik2 = new Pracownik();
		Pracownik pracownik3 = new Pracownik();
		pracownik1.setImi�("�ukasz");
		pracownik2.setImi�("Iza");
		pracownik1.setNazwisko("Franczyk");
		pracownik2.setNazwisko("Stawowczyk");
		pracownik1.setWiek(23);
		pracownik2.setWiek(22);
		
		
		System.out.println(pracownik1.getImi�()+" "+pracownik1.getNazwisko()+" "+ pracownik1.getWiek());
		System.out.println(pracownik2.getImi�()+" "+pracownik2.getNazwisko()+" "+ pracownik2.getWiek());
	}

}
