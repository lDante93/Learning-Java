package wczytywanieWartosciLiczbowych;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;

public class Main
{
	public static void main(String args[])
	{
		double a, b;
		Reader r = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer inp = new StreamTokenizer(r);
try{
		System.out.println("Podaj a:");
		inp.nextToken();
		a = inp.nval;
		System.out.println("Podaj b:");
		inp.nextToken();
		b = inp.nval;
		System.out.println(a + "   " + b);
}
catch(IOException e)
{
	System.out.println("Blad");
}

	}
}
