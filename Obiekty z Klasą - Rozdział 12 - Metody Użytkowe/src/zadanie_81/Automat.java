package zadanie_81;

public class Automat
{
	double cena;
	private int licznik;
	private String miejsce;
	double wplata;

	public Automat(double cena, int licznik, String miejsce)
	{
		this.cena = cena;
		this.licznik = licznik;
		this.miejsce = miejsce;
	}

	void ustawCeneKawy(double cena)
	{
		this.cena = cena;

		String zl = Double.toString(cena).substring(0, 1);
		String gr = Double.toString(cena).substring(2, Double.toString(cena).length()) + "0";
		System.out.println("Ustawiam cene na ---> " + zl + " zl " + gr + " gr");
	}

	void ustawLicznik(int licznik)
	{
		this.licznik = licznik;
		System.out.println("Ustawiam licznik kaw wydanych na ---> " + licznik);
	}

	public void ustawMiejsce(String miejsce)
	{
		this.miejsce = miejsce;
		System.out.println("Ustawiam miejsce na ---> " + miejsce);
	}

	public Automat()
	{
	}

	public void wyswietlInfo()
	{
		System.out.println(this.toString());
	}

	public String toString()
	{
		String zl = Double.toString(cena).substring(0, 1);
		String gr = Double.toString(cena).substring(2, Double.toString(cena).length()) + "0";
		return "\nAutomat do kawy:\n------------------------\n       Lokalizacja: " + miejsce + "\n      Wydanych kaw: "
				+ licznik + "\nCena 1 kubka kawy: " + zl + " zl " + gr + " gr" + "\n";

	}

	public void wydajKawe(int z³, int gr)
	{
		double kwota = (z³ + gr / 100.0);

		String zl3 = Double.toString(kwota).substring(0, 1);
		String gr3 = Double.toString(kwota).substring(2, Double.toString(kwota).length()) + "0";
		if (kwota > cena)
		{
			double reszta = kwota - cena;
			String zl2 = Double.toString(reszta).substring(0, 1);
			String gr2 = Double.toString(reszta).substring(2, Double.toString(reszta).length()) + "0";

			if (Double.parseDouble(zl2) > 0)
			{
				System.out
						.println("Wydanie kawy: Here you are!\n         +reszta: " + zl2 + " zl " + gr2 + " gr" + "\n");
				licznik++;
			} else
			{
				System.out.println("Wydanie kawy: Here you are!\n         +reszta: " + gr2 + " gr" + "\n");
				licznik++;
			}

		} else if (kwota == cena)
		{
			System.out.println("Wydanie kawy: Here you are!\n   ");
			licznik++;
		} else
		{
			System.out.println("ERR: " + zl3 + " zl " + gr3 + " gr" + " nie kupisz kawy!\n");
		}
	}

}
