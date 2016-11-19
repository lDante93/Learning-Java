package zadanie_125;

public class WielokatForemny extends Kolo
{
int kat;
	public WielokatForemny(int kat,double promien, String kolor)
	{
		super(promien, kolor);
		this.kat = kat;
	}
	@Override
	public String toString()
	{
		return "WielokatForemny [kat=" + kat + ", toString()=" + super.toString() + "]";
	}


}
