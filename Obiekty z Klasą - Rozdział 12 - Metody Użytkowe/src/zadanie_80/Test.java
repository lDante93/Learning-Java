package zadanie_80;

public class Test
{

	public static void main(String[] args)
	{
		Adres przesylka1 = new Adres("Nowak", "Jolanta", "Kopciuszka", 12, 34, "12-043", "Kraków");
		Adres przesylka2 = new Adres("Kowalski", "Adam", "Wyspiañskiego", 5, 7, "80-217", "Gdañsk");

		System.out.print(przesylka1);
		System.out.print(przesylka2);

	}

}
