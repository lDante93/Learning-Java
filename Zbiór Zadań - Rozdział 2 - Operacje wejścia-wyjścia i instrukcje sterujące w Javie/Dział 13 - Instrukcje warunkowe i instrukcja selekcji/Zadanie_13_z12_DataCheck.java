import java.util.Scanner;

public class Zadanie_13_z12_DataCheck {
    public static void main(String args[]) {
	    System.out.println("Zmiana formatu daty");
	    Scanner input = new Scanner(System.in);
	    System.out.print("Podaj datê w formacie dd.mm.rrrr: ");
	    String str = input.next();
	    /* Sprawdzamy czy podany ³añcuch znaków ma w³aœciw¹ d³ugoœæ (10 znaków). */
	    boolean isDate = str.length() == 10;
	    /* Jeœli ³añcuch ma w³aœciw¹ d³ugoœæ, to sprawdzamy czy sk³ada siê z w³aœciwych znaków.
	       Znaki o indeksie 2 i 5 powinny byæ kropkami, a pozosta³e znaki cyframi. */
	    if (isDate)
	        isDate = Character.isDigit(str.charAt(0)) &&  Character.isDigit(str.charAt(1)) 
	              && Character.isDigit(str.charAt(3)) &&  Character.isDigit(str.charAt(4))
	              && Character.isDigit(str.charAt(6)) &&  Character.isDigit(str.charAt(7))
	              && Character.isDigit(str.charAt(8)) &&  Character.isDigit(str.charAt(9))
	              && str.charAt(2) == '.' && str.charAt(5) == '.';
	    /* Jeœli ³añcuch znaków jest poprawnie zbudowany, to wyznaczamy wartoœci zmiennych
	       dz (dzieñ), mc (miesi¹c) i rok. Nastêpnie sprawdzamy poprawnoœæ tych danych. */           
	    if (isDate) { 
		    int dz = Integer.parseInt(str.substring(0, 2));  	        
		    int mc = Integer.parseInt(str.substring(3, 5));
		    int rok = Integer.parseInt(str.substring(6, 10));
		    /* Sprawdzamy czy rok nale¿y do ¿¹danego stulecia (wieku), czy numer miesi¹ca
		       nale¿y do zakresu od 1 do 12 oraz czy numer dnia nie przekracza 31.	*/        
		    isDate = rok >= 2000 && rok < 2100 
		          && isDate && mc >= 1 && mc <= 12 
		          && dz > 0 && dz <= 31;
		    /* Dla kwietnia, czerwca, wrzeœnia i paŸdziernika sprawdzamy czy numer dnia
		       nie przekracza 30. */
		    if (mc == 4 || mc == 6 || mc == 9 || mc == 11) 
		        isDate = isDate && dz <= 30;
		    /* Dla lutego w roku przestêpnym, sprawdzamy czy numer dnia nie przekracza 29. */    
		    if (mc == 2 && rok%4 == 0)
		        isDate = isDate && dz <= 29;
		    /* Dla lutego w roku zwyk³ym, sprawdzamy czy numer dnia nie przekracza 28. */    
		    if (mc == 2 && rok%4 != 0)
		        isDate = isDate && dz <= 28;		        
	    }
	    /* W zale¿noœci od wartoœci zmiennej logicznej isDate wyœwietlamy stosown¹ odpowiedŸ. */
	    if (isDate)
	        System.out.println(str+" - poprawna data");
	    else
	        System.out.println(str+" - b³êdna data");
    }
}