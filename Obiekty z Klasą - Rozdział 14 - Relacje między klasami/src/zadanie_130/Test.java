package zadanie_130;

public class Test
{

	public static void main(String[] args)
	{
		int t1[] = { 1, -2, 0 };
		int t2[] = { 3, 1, 28 };
		Equation r1 = new Equation(t1);
		Equation tab[] = { r1, new Equation(t2) };
		System.out.println("----------------------- 0. checkpoint");
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		EqSystem s1=new EqSystem(tab);
		System.out.println("----------------------- 1. checkpoint");
		System.out.println(s1);
	//System.out.println(s1.getSolution());
	//	EqSystem.setNextNumber(2008);
//		int t3[] = { -7, -7, 34 };
//		t1[0]=1; t1[1]=1;
//		tab[0]=new Equation(t1);
//		tab[1]=new Equation(t3);
//		EqSystem s2=new EqSystem(tab);
//	
//		System.out.println("----------------------- 2. checkpoint");
//		System.out.println(s2);
//		System.out.println("----------------------- 3. checkpoint");
//		System.out.println(s1);
	//System.out.println(s1.getSolution()+"\n\n\n");
//		System.out.println(s2);
//		System.out.println(s2.getSolution());
//		Equation tab2[] = {new Equation(new int[]{3,1,5}),
//				new Equation(new int[]{9,3,15})
//	};
//	
//	EqSystem s3=new EqSystem(tab2);
//	System.out.println("----------------------- 4. checkpoint");
//		System.out.println(s3);
//		System.out.println(s3.getSolution());
	}

}
