import java.util.Scanner;

public class Zadanie_12_4_Ró¿nica
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String a_str = input.nextLine();
		StringBuilder cyfra = new StringBuilder(a_str);
		cyfra.reverse();

		String b_str = cyfra.toString();
		int b = Integer.parseInt(b_str);
		int a = Integer.parseInt(a_str);
		int wynik = a - b;
		cyfra.delete(0, cyfra.length());
		cyfra.append(a).append("-").append(b).append("=").append(wynik);
		System.out.println(cyfra);
	}

}
