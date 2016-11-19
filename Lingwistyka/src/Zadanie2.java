import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Zadanie2 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		

		int tablica[] = {0,1,2,3,4,5,6,7,8,9,10,11};
		int stan=tablica[0];
		int stan1=0, stan2=0, stan3=0, stan4=0, stan5=0, stan6=0, stan7=0, stan8=0, stan9=0, stan0=0;
		File plik = new File("test.txt");
		Scanner odczyt= new Scanner(plik);
		StringTokenizer token;
		while(odczyt.hasNextLine())
		{
			token= new StringTokenizer(odczyt.nextLine(),"#");
			while(token.hasMoreElements())
			{
			String g = token.nextToken();		
			char[] c_arr = g.toCharArray();
			int[] int_arr = new int[c_arr.length];
			
				for(int i=0;i<c_arr.length;i++)  
				{		int_arr[i]= (int) c_arr[i]-48;	
				System.out.print(int_arr[i]);		
				}
				
			System.out.println("");


				sprawdzenie:
				{
				for (int i =0; i<int_arr.length-1; i++)
					
				{
					
					
					switch(int_arr[i])
					{
					case 0:
						stan0=tablica[10];
						if(int_arr[i+1]==stan0)
						{
							stan0=tablica[11];
							break sprawdzenie;
						}
						break;

					case 1:
						
						
						stan1=tablica[1];	
						if(int_arr[i+1]==stan1)
						{
							stan1=tablica[11];
							break sprawdzenie;
						}
					
						break;
					case 2:
						
						stan2=tablica[2];
						if(int_arr[i+1]==stan2)
						{
							stan2=tablica[11];
							break sprawdzenie;
						}
						break;

					case 3:
					
						stan3=tablica[3];
						if(int_arr[i+1]==stan3)
						{
							stan3=tablica[11];
							break sprawdzenie;
						}
						break;
					case 4:
						stan4=tablica[4];
						if(int_arr[i+1]==stan4)
						{
							stan4=tablica[11];
							break sprawdzenie;
						}
						break;

					case 5:
						stan5=tablica[5];
						if(int_arr[i+1]==stan5)
						{
							stan5=tablica[11];
							break sprawdzenie;
						}
						break;
					case 6:
						stan6=tablica[6];
						if(int_arr[i+1]==stan6)
						{
							stan6=tablica[11];
							break sprawdzenie;
						}
						break;

					case 7:
						stan7=tablica[7];
						if(int_arr[i+1]==stan7)
						{
							stan7=tablica[11];
							break sprawdzenie;
						}
						break;
					case 8:
						stan8=tablica[8];
						if(int_arr[i+1]==stan8)
						{
							stan8=tablica[11];
							break sprawdzenie;
						}
						break;
					case 9:
						stan9=tablica[9];
						if(int_arr[i+1]==stan9)
						{
							stan9=tablica[11];
							break sprawdzenie;
						}
						break;		
					}
					
				}
				}
			
				if(stan==11)
				{
				System.out.println("Stan akceptowalny.");
				}
			
				else if(stan1==11)
				{
					System.out.println("Stan akceptowalny.");
				}
				else if(stan2==11)
				{
					System.out.println("Stan akceptowalny.");
				}
				else if(stan3==11)
				{
					System.out.println("Stan akceptowalny.");
				}
				else if(stan4==11)
				{
					System.out.println("Stan akceptowalny.");
				}
				else if(stan5==11)
				{
					System.out.println("Stan akceptowalny.");
				}
				else if(stan6==11)
				{
					System.out.println("Stan akceptowalny.");
				}
				else if(stan7==11)
				{
					System.out.println("Stan akceptowalny.");
				}
				else if(stan8==11)
				{
					System.out.println("Stan akceptowalny.");
				}
				else if(stan9==11)
				{
					System.out.println("Stan akceptowalny.");
				}
				else if(stan0==11)
				{
					System.out.println("Stan akceptowalny.");
				}
				else
				{
					System.out.println("Stan nieakceptowalny.");
				}
				stan = tablica[0];
				stan1=0; stan2=0; stan3=0; stan4=0; stan5=0; stan6=0; stan7=0; stan8=0; stan9=0; stan0=0;
				
}
}	
			
}
}
	
