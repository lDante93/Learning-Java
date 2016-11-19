

public class Zadanie_6_6_PrawoLogiczneC {
    public static void main(String args[]) {
        boolean[] bool = {false, true};
        System.out.println("Prawo rozdzielnoœci koniunkcji wzglêdem alternatywy\n");
        System.out.println("p\tq\tr\tq|r\tp&A\tp&q\tp&r\tC|D\tB<=>E");
        System.out.println("\t\t\t(A)\t(B)\t(C)\t(D)\t(E)");
        for(boolean p: bool) for(boolean q: bool) for(boolean r: bool) { 
            System.out.print(p+"\t"+q+"\t"+r);
            boolean a = q|r;
            boolean b = p&a;
            boolean c = p&q;
            boolean d = p&r;
            boolean e = c|d;
            System.out.print("\t"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t");
            System.out.println(b == e);
        }
        System.out.println();
    }
}
