

public class Zadanie_6_3_PrawoDeMorgana
{

    public static void main(String args[]) {
        boolean[] bool = {false, true};
        System.out.println("Zaprzeczenie koniunkcji jest r�wnowa�ne alternatywie zaprzecze�");
        System.out.println("p\tq\tp&&q\t!(p&&q)\t!p\t!q\t!p||!q\t!(p&&q)<=>(!p||!q)");
        for(boolean p: bool)
            for(boolean q: bool) {
                System.out.print(p+"\t"+q+"\t"+(p&&q)+"\t"+!(p&&q));
                System.out.print("\t"+!p+"\t"+!q+"\t"+(!p||!q));
                System.out.println("\t"+(!(p&&q)==(!p||!q)));
                }
        
        System.out.println("\n");
        System.out.println("Zaprzeczenie alternatywy jest r�wnowa�ne koniunkcji zaprzecze�");
        System.out.println("p\tq\tp||q\t!(p||q)\t!p\t!q\t!p&&!q\t!(p||q)<=>(!p&&!q)");
        for(boolean p: bool)
            for(boolean q: bool) {
                System.out.print(p+"\t"+q+"\t"+(p||q)+"\t"+!(p||q));
                System.out.print("\t"+!p+"\t"+!q+"\t"+(!p&&!q));
                System.out.println("\t"+(!(p||q)==(!p&&!q)));
                }
        
        System.out.println("\n");
    }
}
