package zadanie_124;

public abstract class Figura
{
	private String kolor;

	public Figura(String kolor)
	{
		this.kolor = kolor;
	}
	
	abstract public double obliczPole();
	abstract public double obliczObwod();

	
	public String toString()
	{
		return "Figura [kolor=" + kolor + "]";
	}
	
	

}
