
public class Zadanie_10_3_LiczbyNaturalne
{
	public static void main(String args[])
	{

		int liczby[] = { 2, 3, 5, 7, 11, 13, 17 };

		for (int x : liczby)
		{
			System.out.printf("%3d%15.8f%15.8f\n", x,Math.sqrt(x),Math.pow(x, 1/3.0));
		}
	}
}
