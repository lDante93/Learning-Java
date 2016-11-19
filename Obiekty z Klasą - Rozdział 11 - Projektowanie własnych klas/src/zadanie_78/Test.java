package zadanie_78;

public class Test
{

	public static void main(String[] args)
	{
Osoba osoba1 = new Osoba("Dominika","Nowak","80120412026");
Osoba osoba2 = new Osoba("Tomasz","Kowalski","800817");
Osoba osoba3 = new Osoba("Izabela","Stawowczyk","94091010727");
osoba2.wyswietl();
osoba1.wyswietl();
osoba2.zmienPesel("80081743172");
osoba2.zmienImie("Karol");
osoba1.zmienNazwisko("Sus");
osoba1.wyswietl();
osoba2.wyswietl();
osoba1.wyswietlInicjaly();
osoba2.wyswietlInicjaly();


osoba3.wyswietl();
osoba3.wyswietlInicjaly();
	}

}
