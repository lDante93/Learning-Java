package zadanie_127;

import java.util.Arrays;

public class Book
{
	int wys, szer;
	String imie, tytul;
	int id;
	static int nextId = 1;


	public Book(int wys, int szer, String imie, String tytul)
	{
		this.wys = wys;
		this.szer = szer;
		this.imie = imie;
		this.tytul = tytul;
		id = nextId;
		nextId++;
		

	}
public  int getSzer()
{
	return szer;
}
public  int getWys()
{
	return wys;
}
public void ukladanie()
{
	
		int temp;
		temp = this.wys;
		this.wys = this.szer;
		this.szer = temp;
		
	

}

	@Override
	public String toString()
	{
	if(wys<szer)
		return "  " + id + ". (" + szer + "x" + wys + ") " + imie + ": " + tytul + " ---"+ "";
	else
		return "  " + id + ". (" + wys + "x" + szer + ") " + imie + ": " + tytul + " ---"+ "";
	}

}
