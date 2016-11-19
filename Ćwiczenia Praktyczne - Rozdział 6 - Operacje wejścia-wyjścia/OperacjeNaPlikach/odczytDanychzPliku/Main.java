package odczytDanychzPliku;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args)
	{
		String line = "";
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("moje.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Brak pliku");
			System.exit(-1);
		}
	
		BufferedReader inbr = new BufferedReader(new InputStreamReader(fin));
		
		try{
			while((line = inbr.readLine()) !=null){
				System.out.println(line);
				}
		}
				
		
		catch(IOException e)
		{
			System.out.print("Read/Write error.");
				
			}
		}


	}


