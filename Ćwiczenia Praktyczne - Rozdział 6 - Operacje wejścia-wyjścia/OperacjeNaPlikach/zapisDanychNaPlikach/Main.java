package zapisDanychNaPlikach;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args)
	{
		String line = "";
		FileOutputStream fout = null;
		try{
			fout = new FileOutputStream("te.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("B³¹d przy otwieraniu pliku");
			System.exit(-1);
		}
		DataOutputStream out = new DataOutputStream(fout);
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			while(true){
				if((line = inbr.readLine())==null|| line.equals("quit")){
					break;
				}
				out.writeBytes(line);
				out.writeBytes(line);
			}
		}
		catch(IOException e)
		{
			System.out.print("Read/Write error.");
				
			}
		}

	}


