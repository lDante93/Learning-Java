public class Zadanie_9_5_TestBinFloat {
    public static void main(String[] args) {
        float x = Float.intBitsToFloat(Integer.parseInt(args[0], 2));      
        // int n = Integer.parseInt("01111111100000000000000000000000", 2);
        // float x = Float.intBitsToFloat(n);
        System.out.println(args[0]+" -> "+x);
        //System.out.println(" -> "+n);
        //System.out.println(Integer.parseInt(args[0], 2));
int n = Integer.MIN_VALUE;        
System.out.println(n+" -> "+Float.intBitsToFloat(n));
    }
}