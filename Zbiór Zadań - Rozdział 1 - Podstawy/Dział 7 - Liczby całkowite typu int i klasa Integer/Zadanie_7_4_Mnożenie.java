
public class Zadanie_7_4_Mno¿enie {
    public static void main(String args[]) {
        int a = 2451, b = 375;
        System.out.println("a = "+a+", b = "+b);
        /* Wariant 1. - osobne wyœwietlanie tekstu i liczby. */
        System.out.print("a * b = ");
        System.out.println(a*b);
        /* Wariant 2. - b³êdny wynik. */
        System.out.println("a * b = "+a*b);   // Ÿle
        System.out.println("a * b = "+(a*b)); // dobrze 
        /* Wariant 3. - wprowadzamy dodatkow¹ zmienn¹ c. */
        int c = a*b;
        System.out.println("a * b = "+c);
    }
}