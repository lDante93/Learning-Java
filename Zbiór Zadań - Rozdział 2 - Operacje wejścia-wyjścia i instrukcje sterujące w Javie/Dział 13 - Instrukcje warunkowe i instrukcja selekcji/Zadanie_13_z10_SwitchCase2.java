import java.util.Scanner;

public class Zadanie_13_z10_SwitchCase2 {
    public static void main(String args[]) {
        System.out.println("S³owny zapis liczby jednocyfrowej");
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbê naturaln¹ jednocyfrow¹, n = ");
        int n = input.nextInt();
        StringBuilder wynik = new StringBuilder("S³ownie: ");
        if (n >=0 && n < 10) {
            switch (n) {
                case 0: wynik.append("zero"); break;
                case 1: wynik.append("jeden"); break;
                case 2: wynik.append("dwa"); break;
                case 3: wynik.append("trzy"); break;
                case 4: wynik.append("cztery"); break;
                case 5: wynik.append("piêæ"); break;
                case 6: wynik.append("szeœæ"); break;
                case 7: wynik.append("siedem"); break;
                case 8: wynik.append("osiem"); break;
                case 9: wynik.append("dziewiêæ"); break; 
            }
            System.out.println(wynik.append("."));
        } else
        System.out.println("B³êdna wartoœæ liczby!");
    }
}
