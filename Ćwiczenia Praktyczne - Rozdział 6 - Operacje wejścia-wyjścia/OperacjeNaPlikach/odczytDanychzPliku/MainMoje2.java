package odczytDanychzPliku;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainMoje2
{

	public static void main(String[] args)
	{
		String line = "";
		FileReader fin = null;
		try{
			fin = new FileReader("moje.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Brak pliku");
			System.exit(-1);
		}
		BufferedReader input = new BufferedReader(fin);
		
	
		try{
		while((line = input.readLine()) !=null){
			
			System.out.println(line);
			}
		}
	

	catch(Exception e)
	{
		System.out.print("Read/Write error.");

	}
}

}
