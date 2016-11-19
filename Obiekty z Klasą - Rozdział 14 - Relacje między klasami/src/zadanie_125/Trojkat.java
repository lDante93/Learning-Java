package zadanie_125;

public class Trojkat extends Figura
{
	double wysokosc;
double bok;
double bok2;
String kolor;

public Trojkat(double wysokosc,double bok,double bok2,String kolor)
{
	super(kolor);
	this.kolor=kolor;
	this.wysokosc = wysokosc;
	this.bok = bok;
	this.bok2 = bok2;
}



















@Override
public String toString()
{
	return "Trojkat [wysokosc=" + wysokosc + ", bok=" + bok + ", bok2=" + bok2 + ", toString()=" + super.toString()
			+kolor+ "]";
}



















public double obliczPole()
{
	
	return 0.5*wysokosc*(bok+bok2);
}




public double obliczObwod()
{
	
	return wysokosc+bok+bok2;
}
}
