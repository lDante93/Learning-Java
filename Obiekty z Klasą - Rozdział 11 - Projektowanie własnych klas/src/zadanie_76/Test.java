package zadanie_76;

public class Test
{

	public static void main(String[] args)
	{
		Adres przesylka1 = new Adres();
		Adres przesylka2 = new Adres();

		przesylka1.ustawNazwisko("Nowak");
		przesylka1.ustawImie("Jolanta");
		przesylka1.ustawKodMiasto("12-043", "Kraków");
		przesylka1.ustawUlica("Kopciuszka");
		przesylka1.ustawNrDomuMieszkania(12, 34);
		
		
		przesylka2.ustawNazwisko("Kowalski");
		przesylka2.ustawImie("Adam");
		przesylka2.ustawKodMiasto("80-217", "Gdañsk");
		przesylka2.ustawUlica("Wyspiañskiego");
		przesylka2.ustawNrDomuMieszkania(5,7);

		przesylka1.wyswietl();
		przesylka2.wyswietl();

		przesylka1.zmienNrDomu(45);
		przesylka2.zmienNrMieszkania(203);
		przesylka2.wyswietl();
		przesylka1.wyswietl();

	}

}
