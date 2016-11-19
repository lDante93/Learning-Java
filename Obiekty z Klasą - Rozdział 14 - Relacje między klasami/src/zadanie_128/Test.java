package zadanie_128;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Utwor tab[] = { new Utwor("Calypso blues", "Natalia Cole", 4, 59),
				new UtworCD("System", "Amazing", "Seal", 2, 3, 45),
				new UtworMP3("Frank Sinatra", "Day by Day", "frank.mp3", 2.85, 3, 9),
				new Utwor("bede z toba", "Katarzyna Groniec", 4, 8)

		};
		for (int i = 0; i < tab.length; i++)
			System.out.println(tab[i]);
	}

}
