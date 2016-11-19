package zadanie_132;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test
{

	public static void main(String[] args)
	{
		String planWt[]={"MAD","UKO","PRG","HKJ"};
		Czasochlonne czasMiniony[]={
				new AudioBook("Sekret", "Rhonda Byrne", 1,50,53),
				new UtworMP3("Day by Day", "frank.mp3",2.85,3,9),
						 new Day(planWt)
						};
						
		for(int i=0; i<czasMiniony.length;i++)
		{
			System.out.println(czasMiniony[i].zwrocInfoJakoString()+"\n");
		}
		Wielojezyczne jezyk=(Wielojezyczne) (czasMiniony[0]);
		
		System.out.println(jezyk.zwrocPrzetlumaczony());
	
//	Calendar czas = new GregorianCalendar(0,0,0,0,0,0);
//	
//	
//		
//			long sum = czasMiniony[0].podajCzas().getTimeInMillis() +czasMiniony[1].podajCzas().getTimeInMillis()
//					+czasMiniony[2].podajCzas().getTimeInMillis();
//			Calendar sumCalendar = (Calendar)czas.clone();
//			
//			sumCalendar.setTimeInMillis(sum);
//			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//			System.out.println(dateFormat.format(sumCalendar.getTime()));
		
		
		
	//	Calendar calendar = new GregorianCalendar(0, 0, 0, 10, 44, 0);
//		Calendar calendar2 = new GregorianCalendar(0, 0, 0, 10, 44, 54);
//		long sum = calendar.getTimeInMillis() + calendar2.getTimeInMillis();
//		Calendar sumCalendar = (Calendar)calendar.clone();
//		sumCalendar.setTimeInMillis(sum);
//		
//		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//		
//		System.out.println(dateFormat.format(calendar.getTime()));
//		System.out.println(dateFormat.format(calendar2.getTime()));
//		System.out.println(dateFormat.format(sumCalendar.getTime()));
		

		}

}


