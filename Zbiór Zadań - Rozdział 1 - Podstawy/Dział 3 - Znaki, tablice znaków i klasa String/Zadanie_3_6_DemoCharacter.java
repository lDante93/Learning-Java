
import static java.lang.System.*;

public class Zadanie_3_6_DemoCharacter
{

	public static void main(String[] args)
	{
		/* Informacje o metodzie */
		out.println("Klasa: java.lang.Character");
		out.println("Metoda statyczna: digit\n");
		out.println("static int digit(int ch, int radix)");
		out.println("Returns the numeric value of the character ch   " + " in the specified radix.");
		out.println();
		/* Przykadowa tablica znaków */ char znak[] = { 'E', 'u', 'r', 'o', ' ', '2', '0', '1', '2' };
		/* Demonstracja dziaania metody */
		
		
		out.println("Warto znaku jako cyfry w ukadzie dziesitkowym            (radix = 10)");
		for (char z : znak)
			out.println("Znak: " + z + "  Cyfra: " + Character.digit(z, 10));
		out.println("Uwaga: -1 oznacza, e znak nie jest cyfr w tym            ukadzie liczbowym.");
		out.println();
		out.println("Warto znaku jako cyfry w ukadzie szesnastkowym            (radix = 16)");
		for (char z : znak)
			out.println("Znak: " + z + "  Cyfra: " + Character.digit(z, 16));
		out.println("Uwaga: -1 oznacza, e znak nie jest cyfr w tym            ukadzie liczbowym.");

	}
}