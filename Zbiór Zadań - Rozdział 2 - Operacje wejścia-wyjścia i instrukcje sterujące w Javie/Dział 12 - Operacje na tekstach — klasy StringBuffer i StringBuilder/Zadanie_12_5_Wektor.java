import java.util.Scanner;

public class Zadanie_12_5_Wektor
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		StringBuilder �a�cuch = new StringBuilder(str);
		String b = �a�cuch.substring(�a�cuch.indexOf(" ")+1, �a�cuch.indexOf("]"));
		String a = �a�cuch.substring(�a�cuch.indexOf("[")+1, �a�cuch.indexOf(","));
	double B = Double.parseDouble(b);
	double A = Double.parseDouble(a);
	double u = Math.sqrt(((A*A)+(B*B)));
	System.out.println(u);
	}

}
