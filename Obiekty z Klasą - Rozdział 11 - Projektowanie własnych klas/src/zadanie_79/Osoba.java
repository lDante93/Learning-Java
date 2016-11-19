package zadanie_79;

public class Osoba
{
	private String imie, nazwisko, pesel;

	public Osoba(String imie, String nazwisko, String pesel)
	{
		this.nazwisko = nazwisko;
		this.imie = imie;
		this.pesel = pesel;
	}

	public void zmienPesel(String pesel)
	{
		this.pesel = pesel;
	}

	public void zmienImie(String imie)
	{
		this.imie = imie;
	}

	public void zmienNazwisko(String nazwisko)
	{
		this.nazwisko = nazwisko;
	}

	public void wyswietl()
	{

		if (pesel.length() == 11)
		{
			System.out.printf("%1$6s %2$s\n data ur: %3$6s\n plec: %4$6s\n", imie, nazwisko,dataUr(),plec());
			
		} else
		{
			System.out.println("WARNING: Za krotki pesel!");
		}
	}
public String dataUr()
{
	String rok = pesel.substring(0,1);
	int rokCyfra = Integer.parseInt(rok);
	
	String rok2 = pesel.substring(2,4);
	int rokCyfra2 = Integer.parseInt(rok2)-20;
	
	String rok3 = pesel.substring(2,4);
	int rokCyfra3 = Integer.parseInt(rok3);
	
if(rokCyfra==0){
	return (pesel.substring(4,6)+".0"+rokCyfra2+".20"+pesel.substring(0,2)).toString();
}
else if(rokCyfra3>12)
{
	return (pesel.substring(4,6)+"."+(rokCyfra3-80)+".18"+pesel.substring(0,2)).toString();
}
else{
	return ((pesel.substring(4,6)+"."+pesel.substring(2,4)+".19"+pesel.substring(0,2))).toString();
}

}



public String plec()
{
	String cyfra=pesel.substring(9,10);
	 int liczba=Integer.parseInt(cyfra);
	if(liczba%2==0)
	{
	return "kobieta".toString();
	}
	else
	{
		return "mê¿czyzna".toString();
	}
}

	public void wyswietlInicjaly()
	{
		System.out.println(imie.substring(0, 1) + "." + nazwisko.substring(0, 1) + ".");
	}
}
