import java.util.Scanner;

public class Zadanie_13_z13_DataChange {
    public static void main(String args[]) {
	    System.out.println("Zmiana formatu daty");
	    Scanner input = new Scanner(System.in);
	    System.out.print("Podaj datê w formacie dd.mm.rrrr: ");
	    String str = input.next();
	    /* Zak³adamy poprawnoœæ formatu i wartoœci wprowadzonej daty */
	    StringBuilder data = new StringBuilder(str);   
	    data.replace(2, 3, "-").replace(5, 6, "-");
	    data.append(data.substring(0,2)).delete(0, 2);
	    data.insert(0, data.substring(4, 8)).delete(8, 12);
	    System.out.println(data);
     }
}