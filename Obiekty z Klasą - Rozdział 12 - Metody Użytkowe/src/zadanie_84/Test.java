package zadanie_84;

public class Test
{

	public static void main(String[] args)
	{
		Winda w1 = new Winda("Milowa 18", 15, 600), 
				w2 = new Winda("Skrzetuskiego 105"),
				w3 = new Winda();

		w1.printStatus();
		w2.printStatus();
		w3.printStatus();
	}

}
