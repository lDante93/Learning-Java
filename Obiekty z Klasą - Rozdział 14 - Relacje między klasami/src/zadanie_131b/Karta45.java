package zadanie_131b;

public class Karta45 extends Karta23
{


	private String promotor;





public Karta45(String imie, String nazwisko, int semestr, int grupa,String specjalnosc,String promotor)
{
	super(imie,nazwisko,semestr,grupa,specjalnosc);
	this.promotor=promotor;
}




@Override
public String toString()
{
	return "\n*** POLITECHNIKA £ÓDZKA ***"
			+ "\nIMIE I NAZWISKO: "+ imie+ " "+nazwisko
			+ "\nSEMESTR: "+semestr
			+ "\nGRUPA: "+grupa
			
			+"\nSpecjalnosc: "+specjalnosc
			+"\nPromotor: "+promotor
			+ "\nKARTA WIRTUALNA"
			+ "\n-----------------------------";



}
}