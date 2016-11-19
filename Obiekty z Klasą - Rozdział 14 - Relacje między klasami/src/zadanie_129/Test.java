package zadanie_129;

public class Test
{

	public static void main(String[] args)
	{
		NaSprzedaz zestaw[] = { new Book("Sekret", "RhondaByrne", 28.90),
				new UtworCD("Daj mi chwile", "Justyna Steczkowska", 36.70),
				new Apartament("Al. Jerozolimskie", "Warszawa", 78, 730000) 
				};

		for (int i=0;i<zestaw.length;i++)
			System.out.println(zestaw[i]);
		double suma = NaSprzedaz.podlicz(zestaw);
		System.out.println("\n\nRazem wszystko kosztuje: "+suma);
	}

}
