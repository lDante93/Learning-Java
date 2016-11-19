package zadanie_132;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AudioBook implements Czasochlonne, Wielojezyczne
{
private String tytul, autor;
public int godziny,minuty,sekundy;
private Calendar czas;
private int jezyk=Wielojezyczne.PL;

public void ustawJezyk(int jak)
{
	this.jezyk=jak;
}
public String zwrocPrzetlumaczony(int jak)
{
	return "zmiana";
}
public String zwrocPrzetlumaczony()
{
	return zwrocPrzetlumaczony(jezyk);
	
}
public AudioBook(String tytul, String autor, int godziny, int minuty, int sekundy)
{
	this.tytul = tytul;
	this.autor = autor;
	this.godziny = godziny;
	this.minuty = minuty;
	this.sekundy = sekundy;
}

public String zwrocInfoJakoString()
{
	return "----------------------------"
			+"\ntytul: "+tytul
			+"\nautor: "+autor	
			+"\nczas: "+godziny+":"+minuty+":"+sekundy+"(hh:mm:ss)"
			+"\n----------------------------\n";
}

public Calendar podajCzas()
{
	czas = new GregorianCalendar(0,0,0,godziny,minuty,sekundy);
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
}
