import java.util.Scanner;

public class Zadanie_13_z14_DataS�ownie {
    public static void main(String args[]) {
	    System.out.println("Zmiana formatu daty");
	    Scanner input = new Scanner(System.in);
	    System.out.print("Podaj dat� w formacie dd.mm.rrrr: ");
	    String str = input.next();
	    /* Zak�adamy poprawno�� formatu i warto�ci wprowadzonej daty */
        int mc = Integer.parseInt(str.substring(3, 5));
        StringBuilder data = new StringBuilder(str);   
	    data.replace(2, 3, " ").replace(5, 6, " ");
	    switch (mc) {
	            case  1: data.replace(3, 5, "stycznia"); break;
	            case  2: data.replace(3, 5, "lutego"); break;
	            case  3: data.replace(3, 5, "marca"); break;
	            case  4: data.replace(3, 5, "kwietnia"); break;
	            case  5: data.replace(3, 5, "maja"); break;
	            case  6: data.replace(3, 5, "czerwca"); break;
	            case  7: data.replace(3, 5, "lipca"); break;
	            case  8: data.replace(3, 5, "sierpnia"); break;
	            case  9: data.replace(3, 5, "wrze�nia"); break;
	            case 10: data.replace(3, 5, "pa�dziernika"); break;
	            case 11: data.replace(3, 5, "listopada"); break;
	            case 12: data.replace(3, 5, "grudnia"); break;
        }    
	    System.out.println(data);
    }
}