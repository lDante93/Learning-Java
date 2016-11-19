

public class Zadanie_6_5_Xor
{
	public static void main(String args[])
	{
		boolean[] bool = { false, true };
		System.out.println("Operator alternatywy wykluczaj¹cej (XOR) - ^");
		System.out.println("  p\t  q\tp ^ q");
		for (boolean p : bool)
			for (boolean q : bool)
				System.out.println(p + "\t" + q + "\t" + (p ^ q) + "\t" + ((p != q)&&(p||q)));
		System.out.println();
		System.out.println("Operator nie jest równe - !=");
		System.out.println("  p\t  q\tp != q");
		for (boolean p : bool)
			for (boolean q : bool)
				System.out.println(p + "\t" + q + "\t" + (p != q));
		System.out.println();
	}
}