
public class Zadanie_7_2_ObjectInteger {
    public static void main(String args[]) {
        System.out.println("Wybrane metody obiektów klasy Integer\n");
        /* Konstruktor tworz¹cy nowy obiekt typu Integer reprezentuj¹cy
           podan¹ liczbê, w tym przypadku 1024 */
        Integer a = new Integer(1024);
        /* Konstruktor tworz¹cy nowy obiekt klasy Integer na podstawie
           podanego ³añcucha znaków (ci¹gu cyfr). Zero nieznacz¹ce 
           zostanie pominiête */
        Integer b = new Integer("02000");
        /* Statyczna metoda decode() zwraca obiekt reprezentuj¹cy liczbê 
           zakodowan¹ w ³añcuchu znaków - 0 na pocz¹tku oznacza liczbê
           zapisan¹ w systemie ósemkowym */
        Integer c = Integer.decode("02000");
        /* J.w. - pocz¹tek ci¹gu w postaci 0x oznacza liczbê zakodowan¹
           w systemie szesnastkowym */
        Integer d = Integer.decode("0x2000");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        /* Metoda equals() sprawdza, czy obiekt wywo³uj¹cy tê metodê jest
           równy obiektowi podanemu jako parametr. Wynik porównania jest
           wartoœci¹ logiczn¹ (true albo false) */
        System.out.println("Czy obiekt a jest równy obiektowi b? "+
            a.equals(b));
        System.out.println("Czy obiekt a jest równy obiektowi c? "+
            a.equals(c));
        /* Metoda compareTo() porównuje obiekt  wywo³uj¹cy tê metodê 
           z obiektem stanowi¹cym parametr. Wynik jest jedn¹ z liczb: -1,
           0 i 1. 0 oznacza równoœæ obiektów, -1 oznacza, ¿e pierwszy obiekt 
           (wywo³uj¹cy metodê) jest mniejszy od drugiego obiektu (parametru), 
           a 1 oznacza, ¿e pierwszy obiekt jest wiêkszy od drugiego) */
        System.out.println("Porównanie obiektu a z obiektem c? "+
           a.compareTo(c));
        System.out.println("Porównanie obiektu c z obiektem d? "+
           c.compareTo(d));
        System.out.println("Porównanie obiektu d z obiektem c? "+
           d.compareTo(c));
        /* Metoda statyczna valueOf() zwraca obiekt klasy Integer 
           reprezentuj¹cy wartoœæ okreœlon¹ jako parametr - liczba 
           ca³kowita lub ³añcuch znaków (cyfr dziesiêtnych) */
        a = Integer.valueOf(1000);
        b = Integer.valueOf("1000");
        /* Drugi parametr metody statycznej valueOf okreœla podstawê
           systemu liczbowego, w którym nale¿y zinterpretowaæ ci¹g cyfr 
           podany jako pierwszy parametr metody */
        c = Integer.valueOf("1000", 2);  // 1000 w uk³adzie binarnym
        d = Integer.valueOf("1000", 16); // 1000 w uk³adzie szesnastkowym
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        
        /* Porównywanie obiektów */
        System.out.println("Czy obiekt a jest równy obiektowi b? "+
            a.equals(b));
        System.out.println("Czy obiekt a jest równy obiektowi c? "+
            a.equals(c));
        System.out.println("Porównanie obiektu a z obiektem c? "+
           a.compareTo(c));
        System.out.println("Porównanie obiektu c z obiektem d? "+
           c.compareTo(d));
        System.out.println("Porównanie obiektu d z obiektem c? "+
           d.compareTo(c));
    }
}
