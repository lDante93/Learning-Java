package zadanie_88;

public class Test
{

	public static void main(String[] args)
	{
		Trojmian t1 = new Trojmian(1,2,-3);
		t1.wyswietl(Trojmian.PIERWIASTKI);
		t1.wyswietl(Trojmian.MINIMUM);
		System.out.println(t1);
		t1.zmienCzynnik(1,0);
		t1.zmienCzynnik(2,2);
		t1.zmienCzynnik(3,-4);
		
		t1.wyswietl(Trojmian.PIERWIASTKI);
		t1.wyswietl(Trojmian.MINIMUM);
		System.out.println(t1);
		Trojmian t2 = new Trojmian(-1,14,-49);
		Trojmian t3 = new Trojmian(71,0,7);
		Trojmian t4 = new Trojmian(0,0,4);
		Trojmian t5 = new Trojmian(0,0,0);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
	}

}
