

public class Zadanie_6_8_TestChar {
	 public static void main(String[] args) {
	        String str = "A\240b3&4\040"; // punkt a
	        String str2 = "£oœ_0+\t"; // punkt b
	        String str3 = "#\"\304\\\344\b\n"; // punkt c
	        System.out.println("Znaki: "+str);
	        char[] znaki = str.toCharArray();
	        System.out.print("Znak             ");
	        for(char z : znaki)
	            System.out.print("\t"+z);
	        System.out.println();
	        System.out.print("Kod znaku        ");
	        for(char z : znaki)
	            System.out.print("\t"+(int)z);
	        System.out.println();
	        System.out.print("isDigit()        ");
	        for(char z : znaki)
	            System.out.print("\t"+Character.isDigit(z));
	        System.out.println(); 
	        System.out.print("isLetter()       ");
	        for(char z : znaki)
	            System.out.print("\t"+Character.isLetter(z));
	        System.out.println();
	        System.out.print("isLetterOrDigit()");
	        for(char z : znaki)
	            System.out.print("\t"+Character.isLetterOrDigit(z));
	        System.out.println();
	        System.out.print("isLowerCase()    ");
	        for(char z : znaki)
	            System.out.print("\t"+Character.isLowerCase(z));
	        System.out.println();
	        System.out.print("isSpaceChar()    ");
	        for(char z : znaki)
	            System.out.print("\t"+Character.isSpaceChar(z));
	        System.out.println();
	        System.out.print("isUpperCase()    ");
	        for(char z : znaki)
	            System.out.print("\t"+Character.isUpperCase(z));
	        System.out.println();
	        System.out.print("isWhitespace()   ");
	        for(char z : znaki)
	            System.out.print("\t"+Character.isWhitespace(z));
	        System.out.println();
	        System.out.println();
	        System.out.println();
	        
	        System.out.println("Znaki: "+str2);
	        char[] znaki2 = str2.toCharArray();
	        System.out.print("Znak             ");
	        for(char z : znaki2)
	            System.out.print("\t"+z);
	        System.out.println();
	        System.out.print("Kod znaku        ");
	        for(char z : znaki2)
	            System.out.print("\t"+(int)z);
	        System.out.println();
	        System.out.print("isDigit()        ");
	        for(char z : znaki2)
	            System.out.print("\t"+Character.isDigit(z));
	        System.out.println(); 
	        System.out.print("isLetter()       ");
	        for(char z : znaki2)
	            System.out.print("\t"+Character.isLetter(z));
	        System.out.println();
	        System.out.print("isLetterOrDigit()");
	        for(char z : znaki2)
	            System.out.print("\t"+Character.isLetterOrDigit(z));
	        System.out.println();
	        System.out.print("isLowerCase()    ");
	        for(char z : znaki2)
	            System.out.print("\t"+Character.isLowerCase(z));
	        System.out.println();
	        System.out.print("isSpaceChar()    ");
	        for(char z : znaki2)
	            System.out.print("\t"+Character.isSpaceChar(z));
	        System.out.println();
	        System.out.print("isUpperCase()    ");
	        for(char z : znaki2)
	            System.out.print("\t"+Character.isUpperCase(z));
	        System.out.println();
	        System.out.print("isWhitespace()   ");
	        for(char z : znaki2)
	            System.out.print("\t"+Character.isWhitespace(z));
	        System.out.println();
	        System.out.println();
	        System.out.println();
	        System.out.println("Znaki: "+str3);
	        char[] znaki3 = str3.toCharArray();
	        System.out.print("Znak             ");
	        for(char z : znaki3)
	            System.out.print("\t"+z);
	        System.out.println();
	        System.out.print("Kod znaku        ");
	        for(char z : znaki3)
	            System.out.print("\t"+(int)z);
	        System.out.println();
	        System.out.print("isDigit()        ");
	        for(char z : znaki3)
	            System.out.print("\t"+Character.isDigit(z));
	        System.out.println(); 
	        System.out.print("isLetter()       ");
	        for(char z : znaki3)
	            System.out.print("\t"+Character.isLetter(z));
	        System.out.println();
	        System.out.print("isLetterOrDigit()");
	        for(char z : znaki3)
	            System.out.print("\t"+Character.isLetterOrDigit(z));
	        System.out.println();
	        System.out.print("isLowerCase()    ");
	        for(char z : znaki3)
	            System.out.print("\t"+Character.isLowerCase(z));
	        System.out.println();
	        System.out.print("isSpaceChar()    ");
	        for(char z : znaki3)
	            System.out.print("\t"+Character.isSpaceChar(z));
	        System.out.println();
	        System.out.print("isUpperCase()    ");
	        for(char z : znaki3)
	            System.out.print("\t"+Character.isUpperCase(z));
	        System.out.println();
	        System.out.print("isWhitespace()   ");
	        for(char z : znaki3)
	            System.out.print("\t"+Character.isWhitespace(z));
	        System.out.println();
	    }
	
    }

