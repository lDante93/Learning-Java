public class Zadanie_8_7_Txt2Hex
{
	public static void main(String args[])
	{

		String kod = "szyfr120";
		byte[] array = kod.getBytes();
		for (byte b : array)
			System.out.println(Integer.toHexString(b));
	}
}