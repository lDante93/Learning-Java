import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MetodyUdostêpniaj¹ceIzmieniaj¹ceWartoœæElementu {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		GregorianCalendar data2 = new GregorianCalendar(1999, 11, 4);


/*		int miesi¹c2 = data2.get(Calendar.MONTH);
		System.out.println(miesi¹c2);

		
		data2.set(Calendar.MONTH, 9);
		miesi¹c2 = data2.get(Calendar.MONTH);

		System.out.println(miesi¹c2);	
		
		data2.add(Calendar.MONTH, 1);
		miesi¹c2 = data2.get(Calendar.YEAR);

		System.out.println(miesi¹c2);	
		
		System.out.println("/n");System.out.println("/n");
		
	
		
		Date time = data2.getTime();
		System.out.println(time);
		
		System.out.println("");
		System.out.println("");*/

		
		
		
		
		
		
		GregorianCalendar data = new GregorianCalendar();
		
		int today = data.get(Calendar.DAY_OF_MONTH);
		int month = data.get(Calendar.MONTH);

		
		data.set(Calendar.DAY_OF_MONTH, 1);
		
		
		
		int weekday = data.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(weekday);
		int firstDayOfWeek = data.getFirstDayOfWeek();
		System.out.println(firstDayOfWeek);
		
		int indent = 0;
		while(weekday != firstDayOfWeek)
		{
			indent++;
			data.add(Calendar.DAY_OF_MONTH, -1);
			weekday = data.get(Calendar.DAY_OF_WEEK);
		}
		
		
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		
		do
		{
			System.out.printf("%4s", weekdayNames[weekday]);
			data.add(Calendar.DAY_OF_MONTH, 1);
			weekday = data.get(Calendar.DAY_OF_WEEK);
			
		}while( weekday != firstDayOfWeek);
		
		System.out.println();
		
		
		for(int i =1; i<=indent; i++)
			System.out.println("   ");
		data.set(Calendar.DAY_OF_MONTH, 1);
		
		do{
			int day = data.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
	
			if (day == today) System.out.print("*");
			else System.out.print(" ");
			
			data.add(Calendar.DAY_OF_MONTH, 1);
			weekday=data.get(Calendar.DAY_OF_WEEK);
			
			if (weekday == firstDayOfWeek)
				System.out.println();
		}while(data.get(Calendar.MONTH)==month);
		if(weekday != firstDayOfWeek) System.out.println();
		
	
		
	}
}


