package zadanie_125;

public class Prostokat extends Figura
{
double bok,bok2;



public Prostokat(double bok,double bok2,String kolor)
{
	super(kolor);
	this.bok = bok;
	this.bok2 = bok2;
}












@Override
public String toString()
{
	return "Prostokat [bok=" + bok + ", bok2=" + bok2 + ", obliczPole()=" + obliczPole() + ", obliczObwod()="
			+ obliczObwod() + "]";
}












public double obliczPole()
{
	
	return bok*bok2;
}




public double obliczObwod()
{
	
	return 2*bok+2*bok2;
}
}
