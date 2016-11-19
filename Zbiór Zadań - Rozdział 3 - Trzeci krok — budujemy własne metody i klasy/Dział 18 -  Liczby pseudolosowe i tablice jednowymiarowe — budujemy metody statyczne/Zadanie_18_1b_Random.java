
public class Zadanie_18_1b_Random
{

	public static void main(String[] args)
	{
		double liczba ;
		int i =1;
		do{
			
		System.out.println(i+"  "+kostka());i++;
		}while(i<=100);

		
		
	}
	
	static int kostka()
	{
	     return 1+(int)(Math.random()*6);
	}

}
