package zadanie_85;

public class Test
{

	public static void main(String[] args)
	{
		Winda w1 = new Winda("Milowa 18", 15, 600), 
				w2 = new Winda("Skrzetuskiego 105"),
				w3 = new Winda();

		w1.leave(6);
		w2.leave(4);
		w3.leave(2);
		
		w1.comeIn(10);
		w1.printStatus();
		
		w2.comeIn(3);
		w3.comeIn(5);
		w1.comeIn(10);
		w1.printStatus();
		
		w1.leave(12);
		w1.printStatus();
		
	}

}
