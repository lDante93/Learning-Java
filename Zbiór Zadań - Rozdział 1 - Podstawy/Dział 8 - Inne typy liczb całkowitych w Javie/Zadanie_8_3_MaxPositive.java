public class Zadanie_8_3_MaxPositive
{
	public static void main(String args[])
	{
		System.out.println("Binary: ");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("Byte  "+Integer.toBinaryString(Byte.MIN_VALUE)+"   "+Integer.toBinaryString(Byte.MAX_VALUE));
		System.out.println("Short  "+Integer.toBinaryString(Short.MIN_VALUE)+"   "+Integer.toBinaryString(Short.MAX_VALUE));
		System.out.println("Int  "+Integer.toBinaryString(Integer.MIN_VALUE)+"   "+Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println("Long  "+Long.toBinaryString(Long.MIN_VALUE)+"   "+Long.toBinaryString(Long.MAX_VALUE));
		
		System.out.println("Hex: ");
		System.out.println("Byte  "+Integer.toHexString(Byte.MIN_VALUE)+"   "+Integer.toHexString(Byte.MAX_VALUE));
		System.out.println("Short  "+Integer.toHexString(Short.MIN_VALUE)+"   "+Integer.toHexString(Short.MAX_VALUE));
		System.out.println("Int  "+Integer.toHexString(Integer.MIN_VALUE)+"   "+Integer.toHexString(Integer.MAX_VALUE));
		System.out.println("Long  "+Long.toHexString(Long.MIN_VALUE)+"   "+Long.toHexString(Long.MAX_VALUE));
	}
}