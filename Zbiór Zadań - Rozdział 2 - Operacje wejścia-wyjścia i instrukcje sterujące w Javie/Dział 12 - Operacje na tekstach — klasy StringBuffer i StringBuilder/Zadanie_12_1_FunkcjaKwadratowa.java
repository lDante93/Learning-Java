
public class Zadanie_12_1_FunkcjaKwadratowa
{

	public static void main(String[] args)
	{
		int a = 2;
		int b = 4;		
		int delta = 6;
		
		
		StringBuilder napis = new StringBuilder("(");
		napis.append((-b)/(2*a)).append(",").append((-delta)/(4*a)).append(")");
		System.out.println(napis);
		
	}

}
