package zadanie_2_3;

public class PunktTest
{


	public static void main (String [] args)
	{
		Punkt punkt = new Punkt();
		
		punkt.x=2;
		punkt.y=7;
		punkt.inkrX();
		punkt.inkrY();
		punkt.wyswietl();
		
		punkt.zmienX(6);
		punkt.zmienY(1);
		punkt.wyswietl();
	}

}
