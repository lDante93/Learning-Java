package zadanie_127;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Shelf
{
	static int wys;
	private Book book[];
	int sumaSzer;
	static int suma = 0;
	boolean orientacjaPionowa[];
int suma2;
	public Shelf(Book[] ks, int j)
	{

		book = new Book[ks.length];
		for (int i = 0; i < ks.length; i++)
		{

			this.book[i] = ks[i];

		}
		Shelf.wys = j;
	
	}

	public int szerokosc()
	{
		suma2 = 0;
	
		// book = new Book[book.length];
		for (int i = 0; i < book.length; i++)
		{
			
			if (book[i].wys > Shelf.wys)
			{

				book[i].ukladanie();
				suma = suma + book[i].getSzer();
				suma2 = suma2 + book[i].getWys();
				orientacjaPionowa[i] = false;
			}
			//
			else if (i > 0 && book[i - 1].szer > book[i - 1].wys && (Shelf.wys - suma2) > book[i].szer)
			{

				book[i].ukladanie();
				suma2 = suma2 + book[i].getWys();
				orientacjaPionowa[i] = false;
			}

			else
			{

				suma = suma + book[i].getSzer();
				orientacjaPionowa[i] = true;
			}

		}

		return suma;
	}

	@Override
	public String toString()
	{
		orientacjaPionowa=new boolean[book.length];
		StringBuilder sb = new StringBuilder();
		szerokosc();
		for (int i = 0; i < book.length; i++)
		{
			if (orientacjaPionowa[i]==true)
			{
				sb.append(book[i].toString() + " pionowo\n");
			} else if (orientacjaPionowa[i]==false)
			{
				sb.append(book[i].toString() + " poziomo\n");
			}
		}
		return "Wymiary polki:\n" + "wysokosc: " + wys + " cm\nszerokosc: " + suma
				+ " cm\n\nKsiazki (wys x szer) autor, tytul: \n" + sb.toString();

	}

}
// return "Wymiary polki:\nwysokosc: "+wys+" cm\nszerokosc: "
// +
// "\nKsiazki (wys szer) autor, tytul: "+book.toString();