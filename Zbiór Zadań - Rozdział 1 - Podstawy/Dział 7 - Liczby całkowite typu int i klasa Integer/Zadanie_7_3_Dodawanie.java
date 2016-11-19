
public class Zadanie_7_3_Dodawanie {
    public static void main(String args[]) {
        int a = 2451, b = 375;
        System.out.println("a = "+a+", b = "+b);
        /* wariant 1 */
        System.out.print("a + b = ");
        System.out.println(a+b);
        /* wariant 2 */
        System.out.println("a + b = "+a+b); // b³¹d
        System.out.println("a + b = "+(a+b));
        /* wariant 3 */
        int c = a+b;
        System.out.println("a + b = "+c);
    }
}