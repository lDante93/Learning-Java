import java.util.Scanner;

public class Zadanie_13_z14_DataRzymskimi {
    public static void main(String args[]) {
	    System.out.println("Zmiana formatu daty");
	    Scanner input = new Scanner(System.in);
	    System.out.print("Podaj datê w formacie dd.mm.rrrr: ");
	    String str = input.next();
	    /* Zak³adamy poprawnoœæ formatu i wartoœci wprowadzonej daty */
        int mc = Integer.parseInt(str.substring(3, 5));
        StringBuilder data = new StringBuilder(str);   
	    data.replace(2, 3, " ").replace(5, 6, " ");
	    switch (mc) {
	        case  1: data.replace(3, 5, "I"); break;
	        case  2: data.replace(3, 5, "II"); break;
	        case  3: data.replace(3, 5, "III"); break;
	        case  4: data.replace(3, 5, "IV"); break;
	        case  5: data.replace(3, 5, "V"); break;
	        case  6: data.replace(3, 5, "VI"); break;
	        case  7: data.replace(3, 5, "VII"); break;
	        case  8: data.replace(3, 5, "VIII"); break;
	        case  9: data.replace(3, 5, "IX"); break;
	        case 10: data.replace(3, 5, "X"); break;
	        case 11: data.replace(3, 5, "XI"); break;
	        case 12: data.replace(3, 5, "XII"); break;
        }    
	    System.out.println(data);
    }
}