

public class Zadanie_6_2_PrawoLogiczne
{

	public static void main(String args[])
	{
		boolean[] bool = { false, true };
		System.out.println("Prawo wyłączonego środka");
		System.out.println("  p\t !p\tp||!p");
		for (boolean p : bool)
		{
			System.out.println(p+"\t"+!p+"\t"+(p||!p));
		}
		System.out.println("Prawo niesprzeczności");
		System.out.println("  p\t !p\tp&&!p  !(p&&!p)");
		for (boolean p : bool)
		{
			
			System.out.println(p+"\t"+!p+"\t"+(p&&!p)+"\t"+!(p&&!p));
			
		}
		System.out.println("Prawo podwójnego przeczenia");
		System.out.println("  p\t !p\t!(!p)  !(!p)==p");
		for (boolean p : bool)
		{
			System.out.println(p+"\t"+!p+"\t"+!(!p)+"\t"+(!(!p)==p));
		}
	}
}
