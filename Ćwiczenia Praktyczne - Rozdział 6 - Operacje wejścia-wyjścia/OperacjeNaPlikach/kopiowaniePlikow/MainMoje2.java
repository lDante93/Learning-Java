package kopiowaniePlikow;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.sun.xml.internal.ws.Closeable;

public class MainMoje2
{
	  public static void main(String args[]){      

	    //    String fileInput = "C://Users//Dante//Desktop//temp.txt";
	      //  String fileoutput = "C://Users//Dante//Desktop//temp1.txt";
	        String fileInput = "11.txt";
	        String fileoutput = "22.txt";
	        try {
	            FileReader fr=new FileReader(fileInput);
	            FileWriter fw=new FileWriter(fileoutput);

	            int c;
	            while((c=fr.read())!=-1) {
	            	System.out.print((char)c);
	                fw.write(c);
	            } 
	            fr.close();
	            fw.close();

	        } 
	        catch(IOException e) {
	            System.out.println(e);
	        } 
	     }
	}