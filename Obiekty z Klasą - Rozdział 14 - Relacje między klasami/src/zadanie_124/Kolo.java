package zadanie_124;

public class Kolo extends Figura
{
double promien;



public Kolo(double promien,String kolor)
{
	super(kolor);
	this.promien = promien;
	
}


















@Override
public String toString()
{
	return "Kolo [promien=" + promien + ", obliczPole()=" + obliczPole() + ", obliczObwod()=" + obliczObwod() + "]";
}


















public double obliczPole()
{
	
	return promien*promien*Math.PI;
}




public double obliczObwod()
{
	
	return promien*2*Math.PI;
}
}
