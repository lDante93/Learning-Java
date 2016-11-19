
public class Zadanie_12_3_Replace
{

	public static void main(String[] args)
	{
		int a = 2;
		int b = 4;
		int delta = 6;
		double obliczenie = (-delta) / (4 * a);
		double obliczenie2 = (-b) / (2 * a);
		System.out.println(obliczenie);
		System.out.println(obliczenie2);
		String x = Double.toString(obliczenie);
		String y = Double.toString(obliczenie2);
		StringBuilder napis = new StringBuilder("(#1, #2)");

		napis.replace(napis.indexOf("#2"), napis.indexOf("2")+1, x);
		napis.replace(napis.indexOf("#1"), napis.indexOf("1")+1, y);

		System.out.println(napis);

	}

}
