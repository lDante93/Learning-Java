
public class Zadanie_10_8_KπtyOstre
{
    public static void main(String[] args) {
        double a = 3.0, b = 4.0, c = 5.0;
        double alfa, beta;
        int st, min; // do podpunktu c i d
        int sek;     // do podpunktu c
        alfa = Math.asin(a/c);
        beta = Math.acos(a/c);
        /* odpowiedü a */
        System.out.printf("alfa = %.4f rad\nbeta = %.4f rad", alfa, beta);
        /* opdpowiedü b */
        System.out.println(); 
        alfa = Math.toDegrees(alfa);
        beta = Math.toDegrees(beta);
        System.out.printf("alfa = %.1f\u00B0\nbeta = %.1f\u00B0", alfa, beta);
        /* opdpowiedü c */
        System.out.println();
        st = (int)alfa;
        min = (int)((alfa-st)*60+0.5);
        System.out.printf("alfa = %d\u00B0%02d\'\n", st, min);
        st = (int)beta;
        min = (int)((beta-st)*60+0.5);
        System.out.printf("beta = %d\u00B0%02d\'\n", st, min);
        /* opdpowiedü d */
        System.out.println();
        st = (int)alfa;
        min = (int)((alfa-st)*60);
        sek = (int)((alfa-st-min/60.0)*3600+0.5);
        System.out.printf("alfa = %d\u00B0%02d\'%02d\"\n", st, min, sek);
        st = (int)beta;
        min = (int)((beta-st)*60);
        sek = (int)((beta-st-min/60.0)*3600+0.5);
        System.out.printf("beta = %d\u00B0%02d\'%02d\"\n", st, min, sek);
    }
}