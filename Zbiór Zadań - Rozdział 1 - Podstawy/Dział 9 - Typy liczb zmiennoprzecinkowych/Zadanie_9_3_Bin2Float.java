
public class Zadanie_9_3_Bin2Float
{

	public static void main(String[] args)
	{
		
		int c = Integer.valueOf("111110000011110000111000110010", 2);
		float x = Float.intBitsToFloat(c);
		System.out.println(c);
		System.out.print(x);
		
	}

}
