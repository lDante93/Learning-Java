package zadanie_129;

public class Apartament extends NaSprzedaz
{

	private String lokalizacja, miasto;
	private int metraz;
	public Apartament(String lokalizacja, String miasto,int metraz,double cena)
	{
		super(cena);
		this.lokalizacja = lokalizacja;
		this.miasto = miasto;
		this.metraz=metraz;
	}
	@Override
	public String toString()
	{
		return "Lokalizacja: " + lokalizacja + "\nMiasto: " + miasto  + "\nMetraz: " + metraz + " m^2\n" +super.toString();
	}
	
	
}
