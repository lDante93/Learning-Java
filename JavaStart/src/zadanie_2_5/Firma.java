package zadanie_2_5;

public class Firma
{

	public static void main(String[] args)
	{
		Pracownik p [] = new Pracownik[4];
	
		p[0] = new Pracownik();
		p[1] = new Pracownik("³uki");
		p[2] = new Pracownik("³uki", "franczyk");
		p[3] = new Pracownik("³uki", "franczyk", 23);
		
		for(int i=0; i<p.length;i++)
			System.out.println(p[i].imiê+p[i].nazwisko+p[i].wiek);
		
		
		
	}

}
