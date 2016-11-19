

public class Zadanie_6_6_PrawoLogiczneA {
    static boolean impl(boolean p, boolean q) {
        return (Boolean.valueOf(p).compareTo(q) < 1);
    }
    public static void main(String args[]) {
        boolean[] bool = {false, true};
        System.out.println("Prawo przechodnioœci implikacji");
        System.out.println("p\tq\tr\tp=>q\tq=>r\tA & B\tp=>r\tC=>D");
        System.out.println("\t\t\t(A)\t(B)\t(C)\t(D)");
        for(boolean p: bool) for(boolean q: bool) for(boolean r: bool) { 
            System.out.print(p+"\t"+q+"\t"+r);
            System.out.print("\t"+impl(p, q)+"\t"+impl(q,r));
            System.out.print("\t"+(impl(p, q)&impl(q, r)));
            System.out.print("\t"+impl(p,r)+"\t");
            System.out.println(impl(impl(p, q)&impl(q, r), impl(p,r)));
        }
        System.out.println();
    }
}
