package zadanie_2_5;

public class Pracownik
{
	String imiê;
	String nazwisko;
	int wiek;
	
	public Pracownik()
	{
		this.imiê="nie podano";
		this.nazwisko="nie podano";
		this.wiek=99;
	}	
	
	public Pracownik(String imiê)
	{
		this.imiê=imiê;
		this.nazwisko="nie podano";
		this.wiek=99;
	}

	public Pracownik(String imiê, String nazwisko)
	{
		this.imiê=imiê;
		this.nazwisko=nazwisko;
		this.wiek=99;
	}
	public Pracownik(String imiê, String nazwisko, int wiek)
	{
		this.imiê=imiê;
		this.nazwisko=nazwisko;
		this.wiek=wiek;
	}
	
}
