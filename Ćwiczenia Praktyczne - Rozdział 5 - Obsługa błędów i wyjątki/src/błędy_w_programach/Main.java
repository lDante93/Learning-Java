package b³êdy_w_programach;

public class Main
{

	public static void main(String[] args)
	{
		Tablica tablica = new Tablica();
		int value = tablica.getTab(5);
		
		
		if(tablica.isError==true)
			System.out.println("B³¹d");
		else
			System.out.println("Element nr 20 to: "+value);
		

	}
}

		


	


