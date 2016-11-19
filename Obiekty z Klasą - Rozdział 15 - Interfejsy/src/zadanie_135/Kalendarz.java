package zadanie_135;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kalendarz implements Wielojezyczne, Formatowalne
{
private int miesiac,rok,x, jak;


	public Kalendarz(int miesiac, int rok,int jak, int x)
{
	this.miesiac = miesiac;
	this.rok = rok;
	this.x = x;
	this.jak=jak;
}
	public String srodek()
	{
		return "        ";
	}

	public String prawo()
	{
		return "                    ";
	}


	@Override
	public String zwrocWyrownany(int jak)
	{
		if(jak==1)
		{
		return srodek()+this.toString()+prawo();
		}
		else if(jak==2)
		{
			return prawo()+this.toString()+prawo();
		}
		else
			return this.toString();
	}


	@Override
	public String toString()
	{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");
		
		
	//	Date date = new Date(Marc);
		//String sDate= dateFormat.format(date);
		
		
		
		return  "s";
	}
	public void ustawJezyk(int eng)
	{
		// TODO Auto-generated method stub
		
	}

}
