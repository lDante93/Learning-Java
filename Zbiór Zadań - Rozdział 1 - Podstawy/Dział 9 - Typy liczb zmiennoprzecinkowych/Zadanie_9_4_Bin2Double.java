public class Zadanie_9_4_Bin2Double {
    public static void main(String[] args) {
        String bin ="111110000011110000111000110010";
        long n = Long.parseLong(bin, 2);
        double x = Double.longBitsToDouble(n);
        System.out.println("bin:    "+bin);
        System.out.println("long:   "+n);
        System.out.println("double: "+x);
    }
}