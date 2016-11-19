package odczytDanychzPliku;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainMoje4
{

	public static void main(String[] args)
	{
		String content;

		try
		{
			content = new String(Files.readAllBytes(Paths.get("moje.txt")));
			System.out.println(content);
		} catch (IOException e)
		{
			System.out.println("ni ma");
		}

	}

}
