import java.util.Scanner;

public class Zadanie_11_4_SumaLiczbBinarnych
{
	public static void main(String[] args)
	{
		 Scanner input = new Scanner(System.in);
		 input.useRadix(2);
		 int a = input.nextInt();
		 int b = input.nextInt();
	
		System.out.println(a);
		System.out.println(b);
		int suma = a+b;
		String suma_bin =  Integer.toBinaryString(suma);
		System.out.println(suma_bin);
	}
}
