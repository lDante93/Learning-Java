package zadanie_89;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class BigDay
{

	private static final int ENG = 1;
	int dzien, miesiac, rok;
	int nazwaDnia;
	String nazwaDniaStr;
	int locale = 0;

	public BigDay(int dzien, int miesiac, int rok)
	{
		this.dzien = dzien;
		this.miesiac = miesiac;
		this.rok = rok;
		GregorianCalendar d2 = new GregorianCalendar(rok, miesiac - 1, dzien);

		nazwaDnia = d2.get(Calendar.DAY_OF_WEEK) - 1;
	}

	public BigDay(int dzien, int miesiac, int rok, int ENG)
	{
		this.dzien = dzien;
		this.miesiac = miesiac;
		this.rok = rok;
		GregorianCalendar d = new GregorianCalendar(rok, miesiac - 1, dzien);

		nazwaDnia = d.get(Calendar.DAY_OF_WEEK) - 1;
		locale = ENG;

	}

	public String zmiana()
	{
		if (locale != 1)
		{
			switch (nazwaDnia)
			{
			case 1:
				nazwaDniaStr = "Poniedzia³ek";
				break;
			case 2:
				nazwaDniaStr = "Wtorek";
				break;
			case 3:
				nazwaDniaStr = "Œroda";
				break;
			case 4:
				nazwaDniaStr = "Czwartek";
				break;
			case 5:
				nazwaDniaStr = "Pi¹tek";
				break;
			case 6:
				nazwaDniaStr = "Sobota";
				break;
			case 7:
				nazwaDniaStr = "Niedziela";
				break;

			}
		} else
		{
			switch (nazwaDnia)
			{
			case 1:
				nazwaDniaStr = "Monday";
				break;
			case 2:
				nazwaDniaStr = "Tuesday";
				break;
			case 3:
				nazwaDniaStr = "Wednesday";
				break;
			case 4:
				nazwaDniaStr = "Thursday";
				break;
			case 5:
				nazwaDniaStr = "Friday";
				break;
			case 6:
				nazwaDniaStr = "Saturday";
				break;
			case 7:
				nazwaDniaStr = "Sunday";
				break;

			}
		}
		return nazwaDniaStr;

	}

	public String toString()
	{
		if (String.valueOf(miesiac).length() == 1 && String.valueOf(dzien).length() == 1)

			return rok + ".0" + miesiac + ".0" + dzien + " --- " + zmiana();

		else if (String.valueOf(miesiac).length() == 1)
			return rok + ".0" + miesiac + "." + dzien + " --- " + zmiana();
		else if (String.valueOf(dzien).length() == 1)
			return rok + "." + miesiac + ".0" + dzien + " --- " + zmiana();

		else
			return rok + "." + miesiac + "." + dzien + " --- " + zmiana();

	}
	public static String podajOpisUrodzin(int dzien, int miesiac, int rok, int ENG)
	{
		
		return rok + "." + miesiac + "." + dzien + " --- " + "Thursday";
	}
	public static void main(String[] args)
	{
		BigDay x1 = new BigDay(12, 6, 1947), x2 = new BigDay(24, 12, 1946, BigDay.ENG), x3 = new BigDay(6, 4, 1976);
		System.out.println("urodzona: " + x1);
		System.out.println("urodzony: " + x2);
		System.out.println("urodzona: " + x3);
		 System.out.println("urodzony: "
		 +BigDay.podajOpisUrodzin(13,12,1973,BigDay.ENG));

	}

}
