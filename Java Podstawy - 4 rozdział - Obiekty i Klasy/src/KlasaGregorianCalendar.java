


import java.util.*;
import static java.lang.System.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
public class KlasaGregorianCalendar {

	public static void main(String[] args) throws ParseException {
//		// TODO Auto-generated method stub
//		GregorianCalendar data = new GregorianCalendar();
//		GregorianCalendar data2 = new GregorianCalendar(1999, 11, 31);
//	//	GregorianCalendar data3 = new GregorianCalendar(0,Calendar.DECEMBER);
//	//	out.println(data);
//	//	out.println(data2);
//		
//		 GregorianCalendar d2 = new GregorianCalendar(2016,Calendar.AUGUST,23);
//			
//	    String  nazwaDnia = Integer.toString(d2.get(Calendar.DAY_OF_WEEK));
//	    out.println(nazwaDnia);
		
		int year = 2011;
		int month = 7;
		int day = 22;

		// First convert to Date. This is one of the many ways.
		String dateString = String.format("%d-%d-%d", year, month, day);
		Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);

		// Then get the day of week from the Date based on specific locale.
		String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

		System.out.println(dayOfWeek); // Friday
	}

}
