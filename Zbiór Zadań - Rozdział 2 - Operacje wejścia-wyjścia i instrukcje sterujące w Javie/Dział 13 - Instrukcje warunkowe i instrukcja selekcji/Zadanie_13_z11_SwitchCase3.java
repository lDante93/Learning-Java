import java.util.Scanner;

public class Zadanie_13_z11_SwitchCase3 {
    public static void main(String args[]) {
        System.out.println("S³owny zapis liczby naturalnej mniejszej od 1000");
	    Scanner input = new Scanner(System.in);
	    System.out.print("Podaj liczbê naturaln¹ mniejsz¹ od 1000, n = ");
	    int n = input.nextInt();
	    StringBuilder wynik = new StringBuilder("S³ownie: ");
        if (n >= 1000 || n < 0) {
            /* B³¹d. To nie jest liczba naturalna mniejsza od 1000. */
            System.out.println("B³êdna wartoœæ liczby!");
        } else if (n == 0) {
            /* zero */
            wynik.append("zero");
        } else {
            int s = n/100; // Cyfra setek
            if (s != 0)
                switch (s) {
                    case 1: wynik.append("sto"); break;
                    case 2: wynik.append("dwieœcie"); break;
                    case 3: wynik.append("trzysta"); break;
                    case 4: wynik.append("czterysta"); break;
                    case 5: wynik.append("piêæset"); break;
                    case 6: wynik.append("szeœæset"); break;
                    case 7: wynik.append("siedemset"); break;
                    case 8: wynik.append("osiemset"); break;
                    case 9: wynik.append("dziewiêæset"); break;
                }
            n = n%100;
            if (n != 0) {              
                /* Dalej zajmiemy siê dwucyfrow¹ reszt¹. */
                int d = n/10; // Cyfra dziesi¹tek
                int j = n%10; // Cyfra jednoœci
                if (d == 1) {
                    /* Liczba od 10 do 19 */
                    wynik.append(" ");
                    switch (n) {
		                case 10: wynik.append("dziesiêæ"); break;
		                case 11: wynik.append("jedenaœcie"); break;
		                case 12: wynik.append("dwanaœcie"); break;
		                case 13: wynik.append("trzynaœcie"); break;
		                case 14: wynik.append("czternaœcie"); break;
		                case 15: wynik.append("piêtnaœcie"); break;
		                case 16: wynik.append("szesnaœcie"); break;
		                case 17: wynik.append("siedemnaœcie"); break;
		                case 18: wynik.append("osiemnaœcie"); break;
		                case 19: wynik.append("dziewiêtnaœcie"); break;
	                }	           
                } else {
                    if (d != 0) {
	                    wynik.append(" ");
                        /* Dopisujemy pe³ne dziesi¹tki: 20, 30, ..., 90 */
                        switch (d) { // Cyfra dziesi¹tek.
		                    case 2: wynik.append("dwadzieœcia"); break;
		                    case 3: wynik.append("trzydzieœci"); break;
		                    case 4: wynik.append("czterdzieœci"); break;
		                    case 5: wynik.append("piêædziesi¹t"); break;
		                    case 6: wynik.append("szeœædziesi¹t"); break;
		                    case 7: wynik.append("siedemdziesi¹t"); break;
		                    case 8: wynik.append("osiemdziesi¹t"); break;
		                    case 9: wynik.append("dziewiêædziesi¹t"); break;
	                    }
                    }
                    if (j != 0) {
                        wynik.append(" ");
                        /* Dopisujemy jednoœci: 1, 2, ..., 9 */
                        switch (j) {
	                        case 1: wynik.append("jeden"); break;
		                    case 2: wynik.append("dwa"); break;
		                    case 3: wynik.append("trzy"); break;
		                    case 4: wynik.append("cztery"); break;
		                    case 5: wynik.append("piêæ"); break;
		                    case 6: wynik.append("szeœæ"); break;
		                    case 7: wynik.append("siedem"); break;
		                    case 8: wynik.append("osiem"); break;
		                    case 9: wynik.append("dziewiêæ"); break;		            		            		            		            
	                    }
                    }
                }  
            }                       
        }
        wynik.append(".");
        System.out.println(wynik);
    }
}
