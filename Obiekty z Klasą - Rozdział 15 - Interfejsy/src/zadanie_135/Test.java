package zadanie_135;



public class Test
{

	public static void main(String[] args)
	{
	Kalendarz a = new Kalendarz(3,2008,Wielojezyczne.PL,35);
	Formatowalne[] t = {new FormatowanyString("Alicji",35),a};
System.out.println("123456789*123456789*");
for(int i=0;i<t.length;i++)
	System.out.println(t[i].zwrocWyrownany(Formatowalne.LEWO)+"<---");

a.ustawJezyk(Wielojezyczne.ENG);

for(int i=0;i<t.length;i++)
	System.out.println(t[i].zwrocWyrownany(Formatowalne.PRAWO)+"<---");

	}

}
