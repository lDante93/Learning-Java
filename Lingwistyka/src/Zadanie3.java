import java.util.Scanner;

public class Zadanie3{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		int stan=0;
		int kolumna=0;
		int tablica[][] = {{1,2,3,4,5,6,7}, {2,3,4,5,6,7,8}, {5,6,7,8,9,10,11}};

		do{
			
			System.out.println("Wrzu� monet�: 1, 2 lub 5z�.");

			int moneta = input.nextInt();
			
			if(moneta==1 || moneta==2 || moneta ==5)
			{
				switch(moneta)
				{	
				case 1:
					System.out.println("Wrzucono: "+moneta+"z�");
					stan=tablica[0][kolumna];
					
					System.out.println("W parkomacie znajduje si� "+stan+"z�.");
					if(stan<7)
					System.out.println("Do kupna biletu brakuje: "+(7-stan)+"z�");
					kolumna=kolumna+moneta;
					break;
		
				case 2:
					System.out.println("Wrzucono: "+moneta+"z�");
					stan=tablica[1][kolumna];
					
					System.out.println("W parkomacie znajduje si� "+stan+"z�.");
					if(stan<7)
					System.out.println("Do kupna biletu brakuje: "+(7-stan)+"z�");
					kolumna=kolumna+moneta;
					break;
		
				case 5:
					System.out.println("Wrzucono: "+moneta+"z�");
					stan=tablica[2][kolumna];	
					
					System.out.println("W parkomacie znajduje si� "+stan+"z�.");
					if(stan<7)
					System.out.println("Do kupna biletu brakuje: "+(7-stan)+"z�");
					kolumna=kolumna+moneta;
					break;
				}
			}
			
			else
			{
				System.out.println("Wrzuci�e� niepoprawn� monet�.");
			}
			

		
			if(stan==7)
			{
				System.out.println("Stan akceptowalny. Parkomat op�acony.");
				stan=0;
				kolumna=0;
			}
		
			else if(stan>7)
			{
				stan=stan-7;
				System.out.println("Parkomat wydaje reszt�: "+ stan+"z�.");
				
			
				stan=0;
				kolumna=0;
			}
		
		}while(stan<12);
	}
}
