package zadanie_80;

public class Adres
{
	private String nazwisko, imie, kod, miasto, ulica;
	private int numerDomu, numerMieszkania;

	public Adres(String nazwisko, String imie, String ulica, int numerDomu, int numerMieszkania, String kod,
			String miasto)
	{
		this.nazwisko = nazwisko;
		this.imie = imie;
		this.kod = kod;
		this.miasto = miasto;
		this.ulica = ulica;
		this.numerDomu = numerDomu;
		this.numerMieszkania = numerMieszkania;
	}

	void ustawNazwisko(String nazwisko)
	{
		this.nazwisko = nazwisko;
	}

	void ustawImie(String imie)
	{
		this.imie = imie;
	}

	void ustawKodMiasto(String kod, String miasto)
	{
		this.kod = kod;
		this.miasto = miasto;
	}

	void ustawUlica(String ulica)
	{
		this.ulica = ulica;

	}

	void ustawNrDomuMieszkania(int numerDomu, int numerMieszkania)
	{
		this.numerDomu = numerDomu;
		this.numerMieszkania = numerMieszkania;

	}

	void zmienNrMieszkania(int numerMieszkania)
	{

		this.numerMieszkania = numerMieszkania;

	}

	void zmienNrDomu(int numerDomu)
	{
		this.numerDomu = numerDomu;

	}

	// void wyswietl()
	// {
	// System.out.println(imie.substring(0, 1) + ". " + nazwisko);
	// System.out.println("ul. " + ulica + " " + numerDomu + " m. " +
	// numerMieszkania);
	// System.out.println(kod + " " + miasto);
	// }

	public String toString()
	{
		return ("------------------------------------\n" + imie.substring(0, 1) + ". " + nazwisko + "\nul. " + ulica
				+ " " + numerDomu + " m. " + numerMieszkania + "\n" + kod + " " + miasto + "\n"
				+ "------------------------------------\n\n");
	}

}
