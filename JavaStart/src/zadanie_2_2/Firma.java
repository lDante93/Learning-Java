package zadanie_2_2;

public class Firma
{

	public static void main(String[] args)
	{
		Pracownik pracownik[] = new Pracownik[3];

		
		String imiona []={"�ukasz", "Iza", "Adam"};
		String nazwiska []={"Franczyk", "Stawowczyk", "Beton"};
		int liczbaLat[] = {23, 22, 24};
		
		for(int i=0; i<pracownik.length;i++)
		{
			pracownik[i]=new Pracownik();
			pracownik[i].imi�=imiona[i];
			pracownik[i].nazwisko=nazwiska[i];
			pracownik[i].wiek=liczbaLat[i];
		}
		
		
		
		
		for(Pracownik x: pracownik)
		{
			System.out.println(x.imi�+x.nazwisko+x.wiek);
			
		}
		
		
//		pracownik1.imi�="�ukasz";
//		pracownik2.imi�="Iza";
//		pracownik1.nazwisko="Franczyk";
//		pracownik2.nazwisko="Stawowczyk";
//		pracownik1.wiek=23;
//		pracownik2.wiek=22;
//		
//		
//		System.out.println(pracownik1.imi�+" "+pracownik1.nazwisko+" "+ pracownik1.wiek);
//		System.out.println(pracownik2.imi�+" "+pracownik2.nazwisko+" "+ pracownik2.wiek);
	}

}
