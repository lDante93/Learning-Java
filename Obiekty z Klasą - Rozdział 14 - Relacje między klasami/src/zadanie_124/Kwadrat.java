package zadanie_124;

public class Kwadrat extends Figura
{
double bok;



public Kwadrat(double bok,String kolor)
{
	super(kolor);
	this.bok = bok;
	
}









@Override
public String toString()
{
	return "Kwadrat [bok=" + bok + ", obliczPole()=" + obliczPole() + ", obliczObwod()=" + obliczObwod() + "]";
}









public double obliczPole()
{
	
	return bok*bok;
}




public double obliczObwod()
{
	
	return 4*bok;
}
}
