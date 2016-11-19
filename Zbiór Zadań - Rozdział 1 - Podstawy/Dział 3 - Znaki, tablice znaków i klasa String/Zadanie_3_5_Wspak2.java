

public class Zadanie_3_5_Wspak2
{

	public static void main(String[] args)
	{
		char tablica[] = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e' };

		char temp;
		
		for(int i=0, j=tablica.length-1; i<j;i++, j--)
		{
			temp = tablica[i];
			tablica[i]=tablica[j];
			tablica[j]=temp;
			
			
		}
System.out.println(tablica);
		}
		
	}

		

