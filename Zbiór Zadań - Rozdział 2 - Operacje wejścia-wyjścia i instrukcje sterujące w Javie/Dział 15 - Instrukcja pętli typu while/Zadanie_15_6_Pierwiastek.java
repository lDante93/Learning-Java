import java.util.Scanner;

public class Zadanie_15_6_Pierwiastek {
    public static void main(String args[]) {
	    /* Wprowadzanie danych. */
	    System.out.println("Ca�kowity pierwiastek kwadratowy");
	    Scanner input = new Scanner(System.in);
	    int n;
	    do {
	        System.out.print("Podaj liczb� naturaln�, n = ");
	        n = input.nextInt();
        } while (n < 0);
        int p = 0;
        while (p*p <= n) ++p;
        --p; // korekta wyniku
	        System.out.printf("Pierwiastek ca�kowity z %d jest r�wny %d.\n", n, p);
        }
    }
