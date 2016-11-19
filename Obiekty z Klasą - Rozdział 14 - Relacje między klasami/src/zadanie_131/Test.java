package zadanie_131;

public class Test
{
public static void  main(String[] args)
{
//Karta23 karta=new Karta23("BD");

	Karty karty[]={ new Karta("Adam","Kowalski",1,101),
			new Karta23("Anna","Malinowska",4,421, "BD")
//			new Karta45("Tomasz","Król",8,823,"3D","dr hab. XX")
	};
	//karty[0].ustawNazwisko("Nowak");
//	for(int i=1;i<karty.length;i++)
	//	karty[i].drukuj();
	//karty[1].ustawNazwisko("Janiak");
	for(int i=0;i<karty.length;i++)
		System.out.println(karty[i]);
}
}
