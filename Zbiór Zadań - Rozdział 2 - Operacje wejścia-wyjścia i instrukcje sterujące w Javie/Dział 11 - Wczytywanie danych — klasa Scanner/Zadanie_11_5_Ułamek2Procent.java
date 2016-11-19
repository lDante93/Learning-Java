import java.util.Scanner;

public class Zadanie_11_5_U³amek2Procent
{
	public static void main(String[] args)
	{
		 Scanner input = new Scanner(System.in);
		
		 String u³amek = input.next();
		int a = Integer.parseInt(u³amek.substring(0, u³amek.indexOf('/')));
		int b = Integer.parseInt(u³amek.substring((u³amek.indexOf('/')+1)));
		System.out.println(a);
		System.out.println(b);
		double dzielenie = (double)a/b;
		System.out.printf("%.1f%%",dzielenie*100);
		
		
	
	}
}
