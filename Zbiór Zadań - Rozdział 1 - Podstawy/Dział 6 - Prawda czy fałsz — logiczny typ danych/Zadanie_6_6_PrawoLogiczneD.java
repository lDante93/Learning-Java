

public class Zadanie_6_6_PrawoLogiczneD {
    public static void main(String args[]) {
        boolean[] bool = {false, true};
        System.out.println("Prawo odrywania [(p => q) & q] => q\n");
        System.out.println("p\tq\tp=>q\tA & q\tB=>q");
        System.out.println("\t\t(A)\t(B)");
        for(boolean p: bool) for(boolean q: bool) {
            boolean a = Impl.impl(p, q); 
            boolean b = a & q;
            System.out.print(p+"\t"+q+"\t"+a+"\t"+b+"\t");
            System.out.println(Impl.impl(b, q));
        } 
        System.out.println();
    }
}
