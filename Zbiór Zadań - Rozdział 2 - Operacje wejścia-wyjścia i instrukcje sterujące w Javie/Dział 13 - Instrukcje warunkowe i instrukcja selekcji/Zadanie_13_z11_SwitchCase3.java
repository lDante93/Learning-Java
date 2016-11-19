import java.util.Scanner;

public class Zadanie_13_z11_SwitchCase3 {
    public static void main(String args[]) {
        System.out.println("S�owny zapis liczby naturalnej mniejszej od 1000");
	    Scanner input = new Scanner(System.in);
	    System.out.print("Podaj liczb� naturaln� mniejsz� od 1000, n = ");
	    int n = input.nextInt();
	    StringBuilder wynik = new StringBuilder("S�ownie: ");
        if (n >= 1000 || n < 0) {
            /* B��d. To nie jest liczba naturalna mniejsza od 1000. */
            System.out.println("B��dna warto�� liczby!");
        } else if (n == 0) {
            /* zero */
            wynik.append("zero");
        } else {
            int s = n/100; // Cyfra setek
            if (s != 0)
                switch (s) {
                    case 1: wynik.append("sto"); break;
                    case 2: wynik.append("dwie�cie"); break;
                    case 3: wynik.append("trzysta"); break;
                    case 4: wynik.append("czterysta"); break;
                    case 5: wynik.append("pi��set"); break;
                    case 6: wynik.append("sze��set"); break;
                    case 7: wynik.append("siedemset"); break;
                    case 8: wynik.append("osiemset"); break;
                    case 9: wynik.append("dziewi��set"); break;
                }
            n = n%100;
            if (n != 0) {              
                /* Dalej zajmiemy si� dwucyfrow� reszt�. */
                int d = n/10; // Cyfra dziesi�tek
                int j = n%10; // Cyfra jedno�ci
                if (d == 1) {
                    /* Liczba od 10 do 19 */
                    wynik.append(" ");
                    switch (n) {
		                case 10: wynik.append("dziesi��"); break;
		                case 11: wynik.append("jedena�cie"); break;
		                case 12: wynik.append("dwana�cie"); break;
		                case 13: wynik.append("trzyna�cie"); break;
		                case 14: wynik.append("czterna�cie"); break;
		                case 15: wynik.append("pi�tna�cie"); break;
		                case 16: wynik.append("szesna�cie"); break;
		                case 17: wynik.append("siedemna�cie"); break;
		                case 18: wynik.append("osiemna�cie"); break;
		                case 19: wynik.append("dziewi�tna�cie"); break;
	                }	           
                } else {
                    if (d != 0) {
	                    wynik.append(" ");
                        /* Dopisujemy pe�ne dziesi�tki: 20, 30, ..., 90 */
                        switch (d) { // Cyfra dziesi�tek.
		                    case 2: wynik.append("dwadzie�cia"); break;
		                    case 3: wynik.append("trzydzie�ci"); break;
		                    case 4: wynik.append("czterdzie�ci"); break;
		                    case 5: wynik.append("pi��dziesi�t"); break;
		                    case 6: wynik.append("sze��dziesi�t"); break;
		                    case 7: wynik.append("siedemdziesi�t"); break;
		                    case 8: wynik.append("osiemdziesi�t"); break;
		                    case 9: wynik.append("dziewi��dziesi�t"); break;
	                    }
                    }
                    if (j != 0) {
                        wynik.append(" ");
                        /* Dopisujemy jedno�ci: 1, 2, ..., 9 */
                        switch (j) {
	                        case 1: wynik.append("jeden"); break;
		                    case 2: wynik.append("dwa"); break;
		                    case 3: wynik.append("trzy"); break;
		                    case 4: wynik.append("cztery"); break;
		                    case 5: wynik.append("pi��"); break;
		                    case 6: wynik.append("sze��"); break;
		                    case 7: wynik.append("siedem"); break;
		                    case 8: wynik.append("osiem"); break;
		                    case 9: wynik.append("dziewi��"); break;		            		            		            		            
	                    }
                    }
                }  
            }                       
        }
        wynik.append(".");
        System.out.println(wynik);
    }
}
