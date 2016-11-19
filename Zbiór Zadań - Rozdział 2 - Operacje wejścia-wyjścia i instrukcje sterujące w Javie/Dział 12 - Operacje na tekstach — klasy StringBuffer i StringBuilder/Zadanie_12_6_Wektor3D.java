import java.util.Scanner;

public class Zadanie_12_6_Wektor3D
{

	public static void main(String[] args)
	{
		System.out.print("Podaj wspórzdne wektora(w postaci [a, b, c]): ");
		Scanner input = new Scanner(System.in);
		String wekt = input.nextLine().trim();
		System.out.println(wekt);
		input.close();

		StringBuilder tmp = new StringBuilder(wekt);
		/* Usuwamy pierwszy i ostatni znak, czyli nawiasy prostoktne. */
		tmp.deleteCharAt(0).deleteCharAt(tmp.length() - 1);
		/* Znajdujemy pozycje przecinków midzy liczbami. */
		int poz1 = tmp.indexOf(",");
		int poz2 = tmp.lastIndexOf(",");
		/* Odczytujemy wartoci liczb. */
		double a = Double.parseDouble(tmp.substring(0, poz1));
		double b = Double.parseDouble(tmp.substring(poz1 + 1, poz2));
		double c = Double.parseDouble(tmp.substring(poz2 + 1));
		/* Obliczamy i wywietlamy dugo wektora. */
		System.out.println("Dugo wektora " + wekt + " jest równa " + Math.sqrt(a * a + b * b + c * c));
	}
}
