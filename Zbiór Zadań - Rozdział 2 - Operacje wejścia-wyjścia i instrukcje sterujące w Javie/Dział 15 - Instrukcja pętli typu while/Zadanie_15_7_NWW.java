import java.util.Scanner;

public class Zadanie_15_7_NWW {
	   public static void main(String args[]) {    
		    System.out.println("Najmniejsza wspólna wielokrotnoœæ");
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
	        int nww = m;
	        int i=0;
	        while (nww % n != 0) {System.out.println(++i);
	            nww += m;}
	        System.out.printf("NWW(m, n) = %d.\n", nww);
	        }
	    }
