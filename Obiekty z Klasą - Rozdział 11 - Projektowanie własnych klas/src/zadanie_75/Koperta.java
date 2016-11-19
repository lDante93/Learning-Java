package zadanie_75;

public class Koperta
{
	private String kolor;
	private int szerokosc;
	private int wysokosc;
	private double cena;

	public Koperta(String kolor, int szerokosc, int wysokosc, double cena)
	{
		this.kolor = kolor;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
		this.cena = cena;
	}

	public Koperta(String kolor, int szerokosc, int wysokosc)
	{
		this(kolor, szerokosc, wysokosc, 1);
	}

	public Koperta(String kolor, int szerokosc)
	{
		this(kolor, szerokosc, 5, 1);
	}
	public Koperta(String kolor, double cena)
	{
		this(kolor, 5, 5, cena);
	}
	public Koperta(String kolor)
	{
		this(kolor, 5, 5, 1);
	}

	void ustawKolor(String kolor)
	{
		this.kolor = kolor;
	}

	void ustawSzerokosc(int szerokosc)
	{
		this.szerokosc = szerokosc;
	}

	void ustawWysokosc(int wysokosc)
	{
		this.wysokosc = wysokosc;
	}

	void ustawCene(double cena)
	{
		this.cena = cena;
	}

	String podajKolor()
	{
		return kolor;
	}

	int podajSzerokosc()
	{
		return szerokosc;

	}

	int podajWysokosc()
	{
		return wysokosc;
	}

	double podajCene()
	{
		return cena;
	}
	
	public double zmienCeneRelatywnie(int procent)
	{
		return this.cena=this.cena+this.cena*procent/100;
	}
	
	public void wyswietl()
	{
		System.out.println("Kolor koperty: "+kolor);
		System.out.println("Wymiary (szeroksoc x wysokosc): "+szerokosc+"x"+wysokosc);
		System.out.printf("Cena: %.2f\n",cena);
	}
	
}
