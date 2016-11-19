package zadanie_134;

public class Test
{

	public static void main(String[] args)
	{
		Formatowalne[] t= {new FormatowanyInt(103,20),
				new FormatowanyString("Alicja",20),
				new FormatowanyDouble(13.24,20,5),
				new FormatowanyInt(-67,20),
				new FormatowanyDouble(0.5,20,7)
		};
		
System.out.println("123456789*123456789*");
for(int i=0;i<t.length;i++)
	System.out.println(t[i].zwrocWyrownany(Formatowalne.SRODEK)+"<---");

for(int i=0;i<t.length;i++)
	System.out.println(t[i].zwrocWyrownany(Formatowalne.PRAWO)+"<---");
	
	}

}
