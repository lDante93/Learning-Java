import java.util.Scanner;

public class Zadanie_15_3_Mno¿enie
{

    public static void main(String args[]) {
	    /* Wprowadzanie danych. */
	    System.out.println("Podaj dwie liczby naturalne:");
	    Scanner input = new Scanner(System.in);
	    int m, n;
	    do {
	        System.out.print("m = ");
	        m = input.nextInt();
        } while (m < 0);
	    do {
	        System.out.print("n = ");
	        n = input.nextInt();
        } while (n < 0);
	    input.close();
	    /* Obliczenia i wynik. */
	    int iloczyn = 0;
	    while (n > 0) {
		    --n;                 // Zmniejszamy n o 1.
		    iloczyn = iloczyn+m; // Zwiêkszamy iloczyn o m.
	    }	    
	    System.out.printf("Iloczyn liczb %d\n", iloczyn);   
    }
}