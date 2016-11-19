package zadanie_124;

public class Trapez extends Figura
{
	double bok, bok2, wysokosc;

	public Trapez(double bok, double bok2, double wysokosc, String kolor)
	{
		super(kolor);
		this.bok = bok;
		this.bok2 = bok2;
		this.wysokosc = wysokosc;
	}

	@Override
	public double obliczPole()
	{

		return 0.5 * wysokosc * (bok + bok2);
	}

	@Override
	public double obliczObwod()
	{
		double d = Math.sqrt(Math.pow((bok - bok2), 2) + wysokosc) * wysokosc;
		return bok + bok2 + wysokosc + d;
	}

	@Override
	public String toString()
	{
		return "Trapez [bok=" + bok + ", bok2=" + bok2 + ", wysokosc=" + wysokosc + ", obliczPole()=" + obliczPole()
				+ ", obliczObwod()=" + obliczObwod() + "]";
	}

}
