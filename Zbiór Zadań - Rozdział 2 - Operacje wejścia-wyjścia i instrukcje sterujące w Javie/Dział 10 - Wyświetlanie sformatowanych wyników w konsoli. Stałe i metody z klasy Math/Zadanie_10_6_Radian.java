
public class Zadanie_10_6_Radian
{
	public static void main(String[] args)
	{
		double alfa = Math.toDegrees(1); // 1 radian w stopniach
		System.out.println("1 rad = " + alfa + "\u00B0");
		int st, min, sek;
		st = (int) alfa;
		min = (int) ((alfa - st) * 60 + 0.5);
		System.out.printf("1 rad = %d\u00B0%02d\'\n", st, min);
		min = (int) ((alfa - st) * 60);
		sek = (int) ((alfa - st - min / 60.0) * 3600 + 0.5);
		System.out.printf("1 rad = %d\u00B0%02d\'%02d\"\n", st, min, sek);

	}
}
