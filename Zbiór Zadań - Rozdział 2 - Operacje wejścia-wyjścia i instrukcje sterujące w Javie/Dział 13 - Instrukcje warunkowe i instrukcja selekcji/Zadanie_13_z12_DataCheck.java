import java.util.Scanner;

public class Zadanie_13_z12_DataCheck {
    public static void main(String args[]) {
	    System.out.println("Zmiana formatu daty");
	    Scanner input = new Scanner(System.in);
	    System.out.print("Podaj dat� w formacie dd.mm.rrrr: ");
	    String str = input.next();
	    /* Sprawdzamy czy podany �a�cuch znak�w ma w�a�ciw� d�ugo�� (10 znak�w). */
	    boolean isDate = str.length() == 10;
	    /* Je�li �a�cuch ma w�a�ciw� d�ugo��, to sprawdzamy czy sk�ada si� z w�a�ciwych znak�w.
	       Znaki o indeksie 2 i 5 powinny by� kropkami, a pozosta�e znaki cyframi. */
	    if (isDate)
	        isDate = Character.isDigit(str.charAt(0)) &&  Character.isDigit(str.charAt(1)) 
	              && Character.isDigit(str.charAt(3)) &&  Character.isDigit(str.charAt(4))
	              && Character.isDigit(str.charAt(6)) &&  Character.isDigit(str.charAt(7))
	              && Character.isDigit(str.charAt(8)) &&  Character.isDigit(str.charAt(9))
	              && str.charAt(2) == '.' && str.charAt(5) == '.';
	    /* Je�li �a�cuch znak�w jest poprawnie zbudowany, to wyznaczamy warto�ci zmiennych
	       dz (dzie�), mc (miesi�c) i rok. Nast�pnie sprawdzamy poprawno�� tych danych. */           
	    if (isDate) { 
		    int dz = Integer.parseInt(str.substring(0, 2));  	        
		    int mc = Integer.parseInt(str.substring(3, 5));
		    int rok = Integer.parseInt(str.substring(6, 10));
		    /* Sprawdzamy czy rok nale�y do ��danego stulecia (wieku), czy numer miesi�ca
		       nale�y do zakresu od 1 do 12 oraz czy numer dnia nie przekracza 31.	*/        
		    isDate = rok >= 2000 && rok < 2100 
		          && isDate && mc >= 1 && mc <= 12 
		          && dz > 0 && dz <= 31;
		    /* Dla kwietnia, czerwca, wrze�nia i pa�dziernika sprawdzamy czy numer dnia
		       nie przekracza 30. */
		    if (mc == 4 || mc == 6 || mc == 9 || mc == 11) 
		        isDate = isDate && dz <= 30;
		    /* Dla lutego w roku przest�pnym, sprawdzamy czy numer dnia nie przekracza 29. */    
		    if (mc == 2 && rok%4 == 0)
		        isDate = isDate && dz <= 29;
		    /* Dla lutego w roku zwyk�ym, sprawdzamy czy numer dnia nie przekracza 28. */    
		    if (mc == 2 && rok%4 != 0)
		        isDate = isDate && dz <= 28;		        
	    }
	    /* W zale�no�ci od warto�ci zmiennej logicznej isDate wy�wietlamy stosown� odpowied�. */
	    if (isDate)
	        System.out.println(str+" - poprawna data");
	    else
	        System.out.println(str+" - b��dna data");
    }
}