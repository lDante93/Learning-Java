package dostepDoKonsoli;

import java.io.Console;

public class Main
{
	public static void main(String args[])
	{
		Console konsola = System.console();

		if (konsola == null)
		{
			System.out.print("Ni ma konsoli");
			System.exit(-1);

		}
		String line = "";
		while(!"quit".equals(line)){
		line = konsola.readLine("Wprowadz tekst");
		konsola.printf("Wprowadzony tekst to:" + line);
		}
	}

}
