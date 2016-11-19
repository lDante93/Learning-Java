import java.util.Scanner;

public class Zadanie_15_5_Reszta
{
public static void main(String args[]) {
    /* Wprowadzanie danych. */
    System.out.println("Podaj dwie liczby ca³kowite:");
    Scanner input = new Scanner(System.in);
    System.out.print("m = ");
    int m = input.nextInt();
    System.out.print("n = ");
    int n = input.nextInt();
    input.close();
    /* Obliczenia i wynik. */
    if (n == 0) {
	    throw new ArithmeticException("dzielenie przez zero");
	} else {
        int znak = 1;
        if (m < 0) {
	        znak = -1;
	        m = -m;
        }
        if (n < 0) 
	        n = -n;
        while (m >= n)  
	        m = m-n; 
        if (znak == -1)
            m = -m;	         
        System.out.printf("Reszta z dzielenia %d\n", m);
    }
}
}