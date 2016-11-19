package wykorzystanieArgumentowWywolaniaAplikacji;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args)
	{
		if  (args.length<1){
			System.out.println("Wywolanie programu: Main nazwa_pliku");
			System.exit(0);
		}
		String line ="";
		FileInputStream fin = null;
		try{
			fin = new FileInputStream(args[0]);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Brak pliku"+args[0]);
			System.exit(-1);
		}
		DataInputStream out = new DataInputStream(fin);
		BufferedReader inbr = new BufferedReader(new InputStreamReader(fin));
				
		try{
			while((line =inbr.readLine())!=null){
				System.out.print(line);
			}}
		
		catch(IOException e)
		{
			System.out.print("Read/Write error.");
				
			}
		}


	}
