import java.util.Random;
public class Zadanie_18_2_Random2
{
static Random rnd = new Random();
	public static void main(String[] args)
	{
		int i=1;
		int liczba;
		int tab []= new int[6];
	
		do{
			liczba = funkcja();
			i++;
			System.out.println(i+"  "+liczba);
			switch(liczba){
			case 1: tab[0]=++tab[0];
			break;
			case 2:tab[1]=++tab[1];
			break;
			case 3:tab[2]=++tab[2];
			break;
			case 4:tab[3]=++tab[3];
			break;
			case 5:tab[4]=++tab[4];
			break;
			case 6:tab[5]=++tab[5];
			break;
			}
			
		}while(i<1000);
		System.out.println();
System.out.printf("%4s%4d\n", "Liczba jedynek: ",tab[0]);
System.out.printf("%4s%4d\n", "Liczba dwojek: ",tab[1]);
System.out.printf("%4s%4d\n", "Liczba trojek: ",tab[2]);
System.out.printf("%4s%4d\n", "Liczba czworek: ",tab[3]);
System.out.printf("%4s%4d\n", "Liczba piatek: ",tab[4]);
System.out.printf("%4s%4d\n", "Liczba szostek: ",tab[5]);
	}
	
	static int funkcja()
	{
		return 1+(int)(rnd.nextInt(6));
	}
	

}
