

public class Zadanie_6_6_PrawoLogiczneE {
    public static void main(String args[]) {
        boolean[] bool = {false, true};
        System.out.print("Prawo eliminacji implikacji ");
        System.out.println("(p => q) <=> (!p|q)\n");
        System.out.println("p\tq\tp=>q\t!p\t!p|q\tA<=>B");
        System.out.println("\t\t(A)\t\t(B)");
        for(boolean p: bool) for(boolean q: bool) {
            boolean a = Impl.impl(p, q); 
            boolean b = !p | q;
            System.out.print(p+"\t"+q+"\t"+a+"\t"+(!p)+"\t"+b+"\t");
            System.out.println(a == b);
        }
        System.out.println();
    }
}
