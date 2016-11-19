

public class Zadanie_6_1_OperatoryLogiczne
{

	public static void main(String args[])
	{
		boolean[] bool = { false, true };
		System.out.println("Operator negacji (NOT) - !");
		System.out.println("  p\t  !p");
		for (boolean p : bool)
		{
			System.out.println(p+"\t"+!p);
		}
		System.out.println("Operator koniunkcji (AND) - & lub &&");
		System.out.println("  p\t  q\tp & q");
		for (boolean p : bool)
		{
			for (boolean q : bool)
			{
			System.out.println(p+"\t"+q+"\t"+(p&&q));
			}
		}
		System.out.println("Operator alternatywy (OR) - | lub ||");
		System.out.println("  p\t  q\tp | q");
		for (boolean p : bool)
		{
			for (boolean q : bool)
			{
			System.out.println(p+"\t"+q+"\t"+(p|q));
			}
		}
	}
}
