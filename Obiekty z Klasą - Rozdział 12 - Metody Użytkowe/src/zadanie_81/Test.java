package zadanie_81;

public class Test
{

	public static void main(String[] args)
	{
		Automat a = new Automat();
		a.ustawCeneKawy(1.20);
		a.ustawLicznik(50);
		a.ustawMiejsce("PJWSTK Budynek A");
		Automat b = new Automat(1.50,200,"PJWSTK Budynek C");
		a.wyswietlInfo();
		b.wyswietlInfo();
		
		a.wydajKawe(1,10);
		a.wydajKawe(2,0);
		System.out.println(a);
		
		b.wydajKawe(3,60);
		b.wydajKawe(1,50);
		System.out.println(b);
	}

}
