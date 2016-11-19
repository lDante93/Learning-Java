package kopiowaniePlikow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main
{

	public static void main(String[] args)
	{
		if (args.length < 2)
		{
			System.out.println("Wywolanie programu: " + "Main nazwa_pliku_zrodlowego nazwa_pliku_docelowego");
			System.exit(0);
		}
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try
		{
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e)
		{
			System.out.println("Brak pliku: " + args[0]);
			System.exit(-1);
		}
		try
		{
			fout = new FileOutputStream(args[1]);

		} catch (FileNotFoundException e)
		{
			System.out.println("Nie mozna utworzyc pliku: " + args[1]);
			System.exit(-1);
		}
		try
		{
			int b;
			while ((b = fin.read()) != -1)
			{
				fout.write(b);

			}
			System.out.println("Kopiowanie zakonczone!");
		} catch (IOException e)
		{
			System.out.println("Blad wejscia-wyjscia");
		}

	}

}
