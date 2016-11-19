public class Zadanie_9_2_DoubleBin {
    static String zero =
        "0000000000000000000000000000000000000000000000000000000000000000";
    public static void main(String[] args) {
       // double[] a = {0.25, 0.5, 1.0, 2.0, 512.0}; 
         //double[] a = {0.01, 0.1, 1.0, 10.0, 100.0};
        // double[] a = {1.367, 1367, 1.367e-12, 1.367e12, 13.67, -13.67};
         double[] a = {Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
        //double[] a = {0.0, -0.0, Double.MIN_VALUE, Double.MAX_VALUE,2.2250738585072014e-308};
        for(double x : a) {
            System.out.println("x = "+x);
            String tmp = Long.toBinaryString(Double.doubleToLongBits(x));
            String bin = zero.substring(0, 64-tmp.length())+tmp;
            System.out.println("TMPlength"+tmp.length());
            System.out.println("TMP: "+tmp);
            System.out.println("BIN: "+bin);
            System.out.println("Bit znaku: "+bin.charAt(0));
            System.out.println("Cecha:     "+bin.substring(1, 12));
            System.out.println("Mantysa:   "+bin.substring(12));
            System.out.println();
        }
    }
}
