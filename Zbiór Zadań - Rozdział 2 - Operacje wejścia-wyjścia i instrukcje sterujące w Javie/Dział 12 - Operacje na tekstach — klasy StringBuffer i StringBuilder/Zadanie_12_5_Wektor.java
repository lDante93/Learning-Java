import java.util.Scanner;

public class Zadanie_12_5_Wektor
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		StringBuilder ³añcuch = new StringBuilder(str);
		String b = ³añcuch.substring(³añcuch.indexOf(" ")+1, ³añcuch.indexOf("]"));
		String a = ³añcuch.substring(³añcuch.indexOf("[")+1, ³añcuch.indexOf(","));
	double B = Double.parseDouble(b);
	double A = Double.parseDouble(a);
	double u = Math.sqrt(((A*A)+(B*B)));
	System.out.println(u);
	}

}
