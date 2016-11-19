public class Zadanie_8_6_DodajCyfry
{
	public static void main(String args[])
	{
		
//		String cyfra = args[0];
//		char[] c_arr = cyfra.toCharArray();
//		int suma = 0;
//		for (char e : c_arr)
//		{
//			int x = (int) e - 48;
//			suma = suma + x;
//		}
//		System.out.println(suma);
		
		long cyfra = 3784596320L;
		String liczba = Long.toString(cyfra);
		char[] c_arr = liczba.toCharArray();
		int suma = 0;
		for (char e : c_arr)
		{
			int x = (int) e - 48;
			suma = suma + x;
		}
		System.out.println(suma);
		
		
	}
}