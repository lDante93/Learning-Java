import java.util.Scanner;

public class Zadanie_13_7_Min {
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
	    System.out.println("Podaj a ");
	    int a = input.nextInt();
	    System.out.println("Podaj b ");
	    int b = input.nextInt();
	    System.out.println("Podaj c");
	    int c = input.nextInt();
	    
	    
	    if(a>b&&a>c)
	    	System.out.println(a);
	    else if(b>a&&b>c)
	    	System.out.println(b);
	    else if(c>a&&c>b)
	    	System.out.println(b);
    }
}