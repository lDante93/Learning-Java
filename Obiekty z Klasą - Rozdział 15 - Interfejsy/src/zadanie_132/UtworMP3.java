package zadanie_132;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UtworMP3 implements Czasochlonne
{
private String tytul, plik;
private double rozmiar;
private int minuty,sekundy;
private Calendar czas;
public UtworMP3(String tytul, String plik, double rozmiar, int minuty, int sekundy)
{
	this.tytul = tytul;
	this.plik = plik;
	this.rozmiar = rozmiar;
	this.minuty = minuty;
	this.sekundy = sekundy;
}
public Calendar podajCzas()
{
	czas = new GregorianCalendar(0,0,0,0,minuty,sekundy);
	return czas;
}
public Calendar podajCzasWSekundach()
{
	czas = new GregorianCalendar(0,0,0,0,0,sekundy);
	return czas;
}
public Calendar podajCzasWMinutach()
{
	czas = new GregorianCalendar(0,0,0,0,minuty,0);
	return czas;
}
public Calendar podajCzasWGodzinach()
{
	
	czas = new GregorianCalendar(0,0,0,0,0,0);
	return czas;
}
public String zwrocInfoJakoString()
{
	return "----------------------------"
			+"\ntytul: "+tytul
			+"\nplik: "+plik
			+"\nrozmiar: "+rozmiar+" MB"
			+"\nczas: "+minuty+":"+sekundy+"(mm:ss)"
			+"\n----------------------------\n";
}

}
