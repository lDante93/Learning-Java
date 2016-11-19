import java.util.Scanner;

public class Zadanie_15_3b_Mno¿enie
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
	    int iloczyn = 0;
	    int znak;
	    if (n != 0 && m != 0) {
		    if (n > 0)
		        znak = 1;
		    else {
			    znak = -1;
			    n = -n;
		    }
		    if (m < 0) {
			    znak = -znak;
			    m = -m;
		    }
	        while (n > 0) {
		        --n;                 // Zmniejszamy n o 1.
		        iloczyn = iloczyn+m; // Zwiêkszamy iloczyn o m.
	        }
	        if (znak == -1)
	            iloczyn = -iloczyn;
        }	    
	    System.out.printf("Iloczyn liczb %d\n", iloczyn);   
    }
}