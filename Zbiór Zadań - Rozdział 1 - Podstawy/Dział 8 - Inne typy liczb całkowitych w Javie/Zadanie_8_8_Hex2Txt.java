public class Zadanie_8_8_Hex2Txt
{
	public static void main(String args[])
	{

		String hex = "737A796672";
		System.out.print(hex + " -> ");
		byte[] tmp = new byte[hex.length() / 2];
		for (int i = 0; i < tmp.length; ++i)
			tmp[i] = Byte.parseByte(hex.substring(2 * i, 2 * i + 2), 16);
		System.out.println(new String(tmp));
	}
}