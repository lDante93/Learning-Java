package zadanie_126;

public class Test
{
	public static void main(String args[])
	{
		Pies sfora[] = { new PiesRasowy(45321, "Elf", "Agus", "Mati", "czarny", 25, "Barbara Klopotek", "Labrador"),
				new Pies(76589, "As", "bia³o-czarny", 18, "Anna Nowak"),
				new PiesRasowy(9678, "Beta", "Emka", "Fidelus", "brazowy", 8, "Alicja Kot", "York") };

		for (int i = 0; i < sfora.length; i++)
			System.out.println(sfora[i] + "\n\n");
	}
}
