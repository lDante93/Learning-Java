package wykrywanieRodzajuWprowadzonejWartosci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;

public class Main
{

	public static void main(String[] args)
	{
		int a, b;
		Reader r = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer inp = new StreamTokenizer(r);
try{
		System.out.println("Podaj a:");
		while(inp.nextToken()!=StreamTokenizer.TT_NUMBER)
		{
			System.out.println("Podaj poprawna liczbe a:");
		}
		a = (int)inp.nval;
		
		
		System.out.println("Podaj b:");
		while(inp.nextToken()!=StreamTokenizer.TT_NUMBER)
		{
			System.out.println("Podaj poprawna liczbe b:");
		}
		b =(int) inp.nval;
		System.out.println(a + "   " + b);
}
catch(IOException e)
{
	System.out.println("Blad");
}
	}

}
