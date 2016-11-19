public class Zadanie_8_4_Kodowanie
{
	public static void main(String args[])
	{
		String word = "coding";
		byte[] code = word.getBytes();
		
		 for(byte n : code)           
			 System.out.print(" "+n+","); 
		 System.out.println("\b.");
	}
}