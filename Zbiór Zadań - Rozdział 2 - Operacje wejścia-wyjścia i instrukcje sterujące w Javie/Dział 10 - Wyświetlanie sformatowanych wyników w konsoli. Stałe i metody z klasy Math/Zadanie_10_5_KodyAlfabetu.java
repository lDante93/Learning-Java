
public class Zadanie_10_5_KodyAlfabetu
{
	public static void main(String args[])
	{

		String znak = "Znak";
		System.out.printf("%8s%8s%8s%8s\n", "Znak", "OCT", "DEC", "HEX");
		for (int i = 65; i <= 90; i++)
			System.out.printf("%6c%10o%7d%7x\n", (char) i, i, i, i);
	}
}
