package wczytywanieDanychzKlawiatury;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args)
	{
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(inp);
		System.out.println("Wprowadz wierwsz tekstu:");

		try
		{
			String line = inbr.readLine();
			System.out.println("Wprowadzony tekst to::");
			System.out.println(line);
		} catch (IOException e)
		{
			System.out.println("B³¹d odczytu");
		}
	}

}
