package zadanie_131b;

public class Karta23 extends Karta
{


	protected String specjalnosc;
private Karta informacje;




public Karta23(String imie, String nazwisko, int semestr, int grupa,String specjalnosc)
{
	super(imie,nazwisko,semestr,grupa);
	this.specjalnosc=specjalnosc;
}




@Override
public String toString()
{
	return "\n*** POLITECHNIKA £ÓDZKA ***"
			+ "\nIMIE I NAZWISKO: "+ imie+ " "+nazwisko
			+ "\nSEMESTR: "+semestr
			+ "\nGRUPA: "+grupa
			
			+"\nSpecjalnosc: "+specjalnosc
			+ "\nKARTA WIRTUALNA"
			+ "\n-----------------------------";



}
}