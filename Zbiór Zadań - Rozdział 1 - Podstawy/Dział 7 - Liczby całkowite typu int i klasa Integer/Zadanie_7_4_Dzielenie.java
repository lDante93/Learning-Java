
public class Zadanie_7_4_Dzielenie {
    public static void main(String args[]) {
        int a = 2451, b = 375;
        System.out.println("a = "+a+", b = "+b);
        /* Wariant 1. - osobne wyœwietlanie tekstu i liczby. */
        System.out.print("a / b = ");
        System.out.println(a/b);
        /* Wariant 2. - dzielenie ma wy¿szy priorytet od dodawania. */
        System.out.println("a / b = "+a/b);   
        System.out.println("a / b = "+(a/b)); // nawias jest zbêdny
        /* Wariant 3. - wprowadzamy dodatkow¹ zmienn¹ c. */
        int c = a/b;
        System.out.println("a / b = "+c);
    }
}