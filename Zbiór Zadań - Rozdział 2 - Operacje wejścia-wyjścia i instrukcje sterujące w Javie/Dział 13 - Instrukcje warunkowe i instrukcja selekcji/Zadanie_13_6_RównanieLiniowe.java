import java.util.Scanner;

public class Zadanie_13_6_R�wnanieLiniowe {
    public static void main(String args[]) {
	    System.out.println("Podaj wsp�czynniki r�wnania ax+b = 0");
	    Scanner input = new Scanner(System.in);
	    System.out.print("a = ");
	    double a = input.nextDouble();
	    System.out.print("b = ");
	    double b = input.nextDouble();
	    input.close();
	    if (a != 0) {
	        double x = -b/a;
	        System.out.println("x = "+x);
        } else if (b != 0)
	        System.out.println("R�wnanie sprzeczne (0x = 1).");
	    else   
	        System.out.println("R�wnanie to�samo�ciowe (0x = 0).");               
    }
}