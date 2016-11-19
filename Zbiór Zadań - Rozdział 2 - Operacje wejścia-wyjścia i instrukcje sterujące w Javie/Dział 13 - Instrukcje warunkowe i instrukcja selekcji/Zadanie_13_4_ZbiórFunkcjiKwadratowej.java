import java.util.Scanner;

public class Zadanie_13_4_ZbiórFunkcjiKwadratowej {
    public static void main(String args[]) {
	    System.out.println("Podaj wspó³czynniki funkcji kwadratowej:");
	    Scanner input = new Scanner(System.in);
	    System.out.print("a = ");
	    double a = input.nextDouble();
	    if (a == 0) {
		    System.err.println("a = 0, to nie jest funkcja kwadratowa.");
	        System.exit(0);
        }
	    System.out.print("b = ");
	    double b = input.nextDouble();
	    System.out.print("c = ");
	    double c = input.nextDouble();	    
	    input.close(); 
	    double q = (4*a*c-b*b)/(4*a);
	    StringBuilder wynik = new StringBuilder();
	    if (a > 0)
	        wynik.append("<, +oo)").insert(1, q);
	    else
	        wynik.append("(-oo, >").insert(6, q);
	    System.out.println("Zbiór wartoœci: "+wynik);           
    }
}