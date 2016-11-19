package zadanie_75;

public class Test
{

	public static void main(String[] args)
	{
		Koperta k1 = new Koperta("czerwony");
		Koperta k2 = new Koperta("srebrny", 2.0);
		Koperta k3 = new Koperta("czerwony", 20, 10, 3.0);

		k1.wyswietl();
		k2.wyswietl();
		k3.wyswietl();
		k1.zmienCeneRelatywnie(-30);
		k1.wyswietl();
		k1.zmienCeneRelatywnie(30);
		k1.wyswietl();
	}
}
