package zapisDanychNaPlikach;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainMoje2
{

	public static void main(String[] args)
	{
		PrintWriter out = null ;
		try
		{
			out = new PrintWriter("moje.txt");
			Scanner input = new Scanner(System.in);
			String wyraz = "" ;
			while(!wyraz.equals("quit")){
					
			wyraz = input.nextLine();
			if (wyraz.equals("quit"))
			break;
			out.println(wyraz);
			
		}
		} catch (FileNotFoundException e)
		{
			System.out.print("dupa");
		}
		out.close();
	}

}
