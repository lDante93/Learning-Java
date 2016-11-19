
public class Zadanie_12_2_FunkcjaKwadratowaInsert
{

	public static void main(String[] args)
	{
		int a = 2;
		int b = 4;
		int delta = 6;

		StringBuilder napis = new StringBuilder("(, )");
		napis.insert(3, (-delta) / (4 * a));
		napis.insert(1, (-b) / (2 * a));

		System.out.println(napis);

	}

}
