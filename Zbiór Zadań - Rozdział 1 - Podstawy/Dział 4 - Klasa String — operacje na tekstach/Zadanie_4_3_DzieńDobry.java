

public class Zadanie_4_3_Dzie�Dobry
{
    public static void main(String args[]) {
      String napis = "Dzie� Dobry";
      for(int i=0; i<napis.length(); i++)
      System.out.println(napis.charAt(i));
      
      for(int i=0; i<napis.length(); i++)
          System.out.print(napis.charAt(i)+" ");
      
      System.out.println(napis.toUpperCase());
      System.out.println(napis.toLowerCase());
      
      
      char[]tabchar=napis.toCharArray();
      
      
    }
}