package hierarchia_wyj¹tków;

public class Tablica
{

	int tab[];

	public Tablica()
	{
		tab = new int[5];
	}

	public int getTab(int index)
	{
		int val = 0;
		try
		{

			val = tab[index];
int x = 4;
int y=0;
System.out.println(x/y);
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array B³¹d");
			System.out.println(e.toString());
			System.exit(-1);
		}
		catch (Exception e)
		{
			System.out.println("Jakiœ B³¹d");
			System.out.println(e.toString());
			System.exit(-1);
		}
		
	
		return val;
		
		
		
		
		
		
		
	}

}
