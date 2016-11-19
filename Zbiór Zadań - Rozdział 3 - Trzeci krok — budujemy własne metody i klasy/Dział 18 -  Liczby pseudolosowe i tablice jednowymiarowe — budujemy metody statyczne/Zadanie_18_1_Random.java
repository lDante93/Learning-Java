import java.util.Random;;
public class Zadanie_18_1_Random
{
	static Random rnd = new Random();
	public static void main(String[] args)
	{
	
		int i =1;
		do{
			
		System.out.println(i+"  "+kostka());i++;
		}while(i<=100);
	}
	
	static int kostka()
	{
		 return 1+rnd.nextInt(6); 
	}

}
