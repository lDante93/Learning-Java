package zadanie_2_5;

public class Pracownik
{
	String imi�;
	String nazwisko;
	int wiek;
	
	public Pracownik()
	{
		this.imi�="nie podano";
		this.nazwisko="nie podano";
		this.wiek=99;
	}	
	
	public Pracownik(String imi�)
	{
		this.imi�=imi�;
		this.nazwisko="nie podano";
		this.wiek=99;
	}

	public Pracownik(String imi�, String nazwisko)
	{
		this.imi�=imi�;
		this.nazwisko=nazwisko;
		this.wiek=99;
	}
	public Pracownik(String imi�, String nazwisko, int wiek)
	{
		this.imi�=imi�;
		this.nazwisko=nazwisko;
		this.wiek=wiek;
	}
	
}
