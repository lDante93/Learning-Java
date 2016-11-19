
public class Zadanie_7_7_Sumuj {
    public static void main(String args[]) {
        int suma = 0;
   for(String e:args)
   {
	   int liczba = new Integer(e);
	   suma=suma+liczba;
	   
        
   }
   System.out.println(suma);
    }
}