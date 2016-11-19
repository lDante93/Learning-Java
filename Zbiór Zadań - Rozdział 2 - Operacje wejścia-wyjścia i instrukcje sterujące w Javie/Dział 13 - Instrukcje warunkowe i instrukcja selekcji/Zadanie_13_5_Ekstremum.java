import java.util.Scanner;

public class Zadanie_13_5_Ekstremum {
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
	    double p = -b/(2*a); 
	    double q = (4*a*c-b*b)/(4*a);
	       
	    StringBuilder wynik = new StringBuilder();
	    wynik.append("Funkcja jest #1 w przedziale (-oo, ").append(p);
	    wynik.append("> i #2 w przedziale <").append(p).append(", +oo).");
	    int p1 = wynik.indexOf("#1");
	    int p2 = wynik.indexOf("#2");
	    if (a > 0)
	        wynik.replace(p2, p2+2, "rosn¹ca").replace(p1, p1+2, "malej¹ca");
	    else
	        wynik.replace(p2, p2+2, "malej¹ca").replace(p1, p1+2, "rosn¹ca");
	    System.out.println(wynik);
	    wynik.delete(0, wynik.length());
	    wynik.append("Funkcja osi¹ga wartoœæ ");
	    if (a > 0)
	        wynik.append("minimaln¹");
	    else
	        wynik.append("maksymaln¹");
	    wynik.append(" y = ").append(q).append(" w punkcie x = ").append(p).append(".");	    
	    System.out.println(wynik);               
    }
}