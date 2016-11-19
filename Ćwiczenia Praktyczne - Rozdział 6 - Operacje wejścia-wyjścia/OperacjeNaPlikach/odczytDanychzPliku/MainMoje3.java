package odczytDanychzPliku;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainMoje3
{

	public static void main(String[] args)
	{
		String line = "";
		Scanner in = null;
		try
		{
			in = new Scanner(new FileReader("moje.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("nie ma");
		}

		while (in.hasNextLine() == true)
		{
			line = in.nextLine();
			System.out.println(line);
		}

	}

}
