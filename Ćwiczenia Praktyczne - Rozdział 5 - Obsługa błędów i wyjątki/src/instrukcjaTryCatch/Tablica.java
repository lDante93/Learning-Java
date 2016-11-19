package instrukcjaTryCatch;

public class Tablica
{

	int tab[];

	public Tablica()
	{
		tab = new int[5];
	}

	public int getTab(int index)
	{
//		int val = 0;
//		try
//		{
//
//			val = tab[index];
//
//		} catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("B³¹d");
//			System.out.println(e.toString());
//			System.exit(-1);
//		}
//		return val;
		
		
		if(index<0||index>4)
		{
			throw new ArrayIndexOutOfBoundsException("Index poza zakresem");
		}
		
		return tab[index];
		
		
		
		
	}

}
