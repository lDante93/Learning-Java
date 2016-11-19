package zadanie_129;

public class UtworCD extends NaSprzedaz
{
	private String tytul, wykonawca;
	public UtworCD(String tytul, String wykonawca,double cena)
	{
		super(cena);
		this.tytul = tytul;
		this.wykonawca = wykonawca;
	}


	public String toString()
	{
		return "Tytul: " + tytul + "\nWykonawca: " + wykonawca + "\n" + super.toString();
	}



}
