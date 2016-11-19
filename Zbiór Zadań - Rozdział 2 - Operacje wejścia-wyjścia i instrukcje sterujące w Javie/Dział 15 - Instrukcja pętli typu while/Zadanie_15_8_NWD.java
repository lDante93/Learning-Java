import java.util.Scanner;

public class Zadanie_15_8_NWD {
    public static void main(String args[]) {    
	    System.out.println("Najmniejszy wspólny dzielnik");
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
	    /* Obliczenia i wynik */
        while (m != n) 
            if (m > n)
                m = m-n;
            else
                n = n-m;
        System.out.printf("NWD(m, n) = %d.\n", m);
    }
}
