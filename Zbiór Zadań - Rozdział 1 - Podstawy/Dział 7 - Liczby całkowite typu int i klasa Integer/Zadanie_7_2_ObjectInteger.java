
public class Zadanie_7_2_ObjectInteger {
    public static void main(String args[]) {
        System.out.println("Wybrane metody obiekt�w klasy Integer\n");
        /* Konstruktor tworz�cy nowy obiekt typu Integer reprezentuj�cy
           podan� liczb�, w tym przypadku 1024 */
        Integer a = new Integer(1024);
        /* Konstruktor tworz�cy nowy obiekt klasy Integer na podstawie
           podanego �a�cucha znak�w (ci�gu cyfr). Zero nieznacz�ce 
           zostanie pomini�te */
        Integer b = new Integer("02000");
        /* Statyczna metoda decode() zwraca obiekt reprezentuj�cy liczb� 
           zakodowan� w �a�cuchu znak�w - 0 na pocz�tku oznacza liczb�
           zapisan� w systemie �semkowym */
        Integer c = Integer.decode("02000");
        /* J.w. - pocz�tek ci�gu w postaci 0x oznacza liczb� zakodowan�
           w systemie szesnastkowym */
        Integer d = Integer.decode("0x2000");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        /* Metoda equals() sprawdza, czy obiekt wywo�uj�cy t� metod� jest
           r�wny obiektowi podanemu jako parametr. Wynik por�wnania jest
           warto�ci� logiczn� (true albo false) */
        System.out.println("Czy obiekt a jest r�wny obiektowi b? "+
            a.equals(b));
        System.out.println("Czy obiekt a jest r�wny obiektowi c? "+
            a.equals(c));
        /* Metoda compareTo() por�wnuje obiekt  wywo�uj�cy t� metod� 
           z obiektem stanowi�cym parametr. Wynik jest jedn� z liczb: -1,
           0 i 1. 0 oznacza r�wno�� obiekt�w, -1 oznacza, �e pierwszy obiekt 
           (wywo�uj�cy metod�) jest mniejszy od drugiego obiektu (parametru), 
           a 1 oznacza, �e pierwszy obiekt jest wi�kszy od drugiego) */
        System.out.println("Por�wnanie obiektu a z obiektem c? "+
           a.compareTo(c));
        System.out.println("Por�wnanie obiektu c z obiektem d? "+
           c.compareTo(d));
        System.out.println("Por�wnanie obiektu d z obiektem c? "+
           d.compareTo(c));
        /* Metoda statyczna valueOf() zwraca obiekt klasy Integer 
           reprezentuj�cy warto�� okre�lon� jako parametr - liczba 
           ca�kowita lub �a�cuch znak�w (cyfr dziesi�tnych) */
        a = Integer.valueOf(1000);
        b = Integer.valueOf("1000");
        /* Drugi parametr metody statycznej valueOf okre�la podstaw�
           systemu liczbowego, w kt�rym nale�y zinterpretowa� ci�g cyfr 
           podany jako pierwszy parametr metody */
        c = Integer.valueOf("1000", 2);  // 1000 w uk�adzie binarnym
        d = Integer.valueOf("1000", 16); // 1000 w uk�adzie szesnastkowym
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        
        /* Por�wnywanie obiekt�w */
        System.out.println("Czy obiekt a jest r�wny obiektowi b? "+
            a.equals(b));
        System.out.println("Czy obiekt a jest r�wny obiektowi c? "+
            a.equals(c));
        System.out.println("Por�wnanie obiektu a z obiektem c? "+
           a.compareTo(c));
        System.out.println("Por�wnanie obiektu c z obiektem d? "+
           c.compareTo(d));
        System.out.println("Por�wnanie obiektu d z obiektem c? "+
           d.compareTo(c));
    }
}
