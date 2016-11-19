import java.util.Scanner;

public class Zadanie_13_z15_Dzie�Tygodnia {
    public static void main(String args[]) {
	    System.out.println("Jaki to dzie� tygodnia?");
	    Scanner input = new Scanner(System.in);
	    System.out.print("Podaj dat� w formacie dd.mm.rrrr: ");
	    String str = input.next();
	    /* Zak�adamy, �e podana data jest poprawna. Odczytujemy dane. */
	    int y = Integer.parseInt(str.substring(6, 10));
		int m = Integer.parseInt(str.substring(3, 5));
		int d = Integer.parseInt(str.substring(0, 2));	
		/* Wykonujemy obliczenia wg wzoru Zellera z poprawkami Keitha. */
	    int z = (m < 3)?y-1:y;
	    int c = (m < 3)?0:2;
	    int dt = (23*m/9+d+4+y+z/4-z/100+z/400-c)%7;
	    /* Formu�ujemy odpowied�, zamienij�c warto�� liczbow� dt na nazw� dnia. */
        StringBuilder data = new StringBuilder(str);
        data.append(" - ");
        switch (dt) {
	        case  0: data.append("niedziela"); break;
	        case  1: data.append("poniedzia�ek"); break;
            case  2: data.append("wtorek"); break;
            case  3: data.append("�roda"); break;
            case  4: data.append("czwartek"); break;
            case  5: data.append("pi�tek"); break;
            case  6: data.append("sobota"); break;	            
        }
        System.out.println(data);
    }
}