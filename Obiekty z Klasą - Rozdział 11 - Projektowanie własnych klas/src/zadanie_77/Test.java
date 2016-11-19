package zadanie_77;

public class Test
{

	public static void main(String[] args)
	{
	GoldNumber nr1 = new GoldNumber("Piotr",605,5,4,3);
	GoldNumber nr2 = new GoldNumber("Kasia",888,2,3);
	GoldNumber nr3 = new GoldNumber("Mariusz",501,7);
	
	nr1.wyswietl();
	nr2.wyswietl();
	nr3.wyswietl();
	nr1.zmienCyfre(1,7);
	nr2.zmienCyfre(2,5);
	nr3.zmienCyfre(3,4);
	nr1.wyswietl();
	nr2.wyswietl();
	nr3.wyswietl();
	}

}
