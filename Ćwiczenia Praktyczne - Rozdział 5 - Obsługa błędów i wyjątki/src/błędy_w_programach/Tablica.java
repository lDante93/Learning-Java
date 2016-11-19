package b³êdy_w_programach;

public class Tablica
{
	boolean isError=false;
	int tab[];
	public Tablica()
	{
		tab= new int[5];
	}
	public int getTab(int index){
		if (index>=0&&index<5)
		{
		isError=false;
			return tab[index];
		}
		else
		{
			isError=true;
			return -1;
			
		}
	}
	


}

