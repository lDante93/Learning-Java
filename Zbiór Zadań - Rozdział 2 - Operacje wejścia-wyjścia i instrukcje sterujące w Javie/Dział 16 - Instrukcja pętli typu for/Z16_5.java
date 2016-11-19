public class Z16_5 {
    public static void main(String args[]) {    
	    System.out.println("Pi¹tkowy system liczenia\n");        
        StringBuilder linia = new StringBuilder();
        for(int i = 0; i < 36; ++i) 
            linia.append("-");
        /* Tabliczka dodawania. */
        System.out.println("Tabliczka dodawania");
        System.out.println(linia);
        System.out.print("|  X |");
        for(int i = 0; i <= 5; ++i) 
            System.out.printf("%3s |", Integer.toString(i, 5));
        System.out.println();
        System.out.println(linia);
        for(int j = 0; j <= 5; ++j) {
	        System.out.printf("|%3s |", Integer.toString(j, 5));
	        for(int i = 0; i <= 5; ++i) 
                System.out.printf("%3s |", Integer.toString(i+j, 5));
	        System.out.println();
        }
        System.out.println(linia);
        
        /* Tabliczka mno¿enia. */
        System.out.println("Tabliczka mno¿enia");
        System.out.println(linia);
        System.out.print("|  X |");
        for(int i = 0; i <= 5; ++i) 
            System.out.printf("%3s |", Integer.toString(i, 5));
        System.out.println();
        System.out.println(linia);
        for(int j = 0; j <= 5; ++j) {
	        System.out.printf("|%3s |", Integer.toString(j, 5));
	        for(int i = 0; i <= 5; ++i) 
                System.out.printf("%3s |", Integer.toString(i*j, 5));
	        System.out.println();
        }
        System.out.println(linia);
    }
}
