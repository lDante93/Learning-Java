import java.util.Scanner;

public class Zadanie_11_5_U�amek2Procent
{
	public static void main(String[] args)
	{
		 Scanner input = new Scanner(System.in);
		
		 String u�amek = input.next();
		int a = Integer.parseInt(u�amek.substring(0, u�amek.indexOf('/')));
		int b = Integer.parseInt(u�amek.substring((u�amek.indexOf('/')+1)));
		System.out.println(a);
		System.out.println(b);
		double dzielenie = (double)a/b;
		System.out.printf("%.1f%%",dzielenie*100);
		
		
	
	}
}
