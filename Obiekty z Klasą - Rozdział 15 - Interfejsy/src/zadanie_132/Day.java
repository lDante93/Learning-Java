package zadanie_132;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Day implements Czasochlonne
{
	private String a, b, c, d;
	private String tablica[];
	private int godziny=6,minuty=45;
	private Calendar czas;
	public Day(String a, String b, String c, String d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Day(String tablica[])
	{
		this.tablica = tablica;
	}
	public Calendar podajCzas()
	{
		czas = new GregorianCalendar(0,0,0,godziny,minuty,0);
		return czas;
	}
	public String zwrocInfoJakoString()
	{
		return "plan" + "\n" + tablica[0] + "\n" + tablica[1] + "\n" + tablica[2] + "\n" + tablica[3] + "\n" + "zajecia: " + "\n" + "przerwy: " + "\n"
				+ "czas: "

		;
	}
	public Calendar podajCzasWSekundach()
	{
		czas = new GregorianCalendar(0,0,0,0,0,0);
		return czas;
	}
	public Calendar podajCzasWMinutach()
	{
		czas = new GregorianCalendar(0,0,0,0,minuty,0);
		return czas;
	}
	public Calendar podajCzasWGodzinach()
	{
		
		czas = new GregorianCalendar(0,0,0,godziny,0,0);
		return czas;
	}
}
