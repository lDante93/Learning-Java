import java.util.Scanner;

public class Zadanie_15_6_Pierwiastek {
    public static void main(String args[]) {
	    /* Wprowadzanie danych. */
	    System.out.println("Ca³kowity pierwiastek kwadratowy");
	    Scanner input = new Scanner(System.in);
	    int n;
	    do {
	        System.out.print("Podaj liczbê naturaln¹, n = ");
	        n = input.nextInt();
        } while (n < 0);
        int p = 0;
        while (p*p <= n) ++p;
        --p; // korekta wyniku
	        System.out.printf("Pierwiastek ca³kowity z %d jest równy %d.\n", n, p);
        }
    }
