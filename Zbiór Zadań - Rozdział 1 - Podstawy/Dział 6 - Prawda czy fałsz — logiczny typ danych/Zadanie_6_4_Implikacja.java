

public class Zadanie_6_4_Implikacja
{

    public static void main(String args[]) {
        boolean[] bool = {false, true};
        System.out.println("Implikacja - je¿eli p, to q");
        System.out.println("p\tq\tp=>q");
        for(boolean p: bool)
            for(boolean q: bool) 
                System.out.println(p+"\t"+q+"\t"+(Boolean.valueOf(p).compareTo(q) < 1));
        System.out.println();
    }
}

