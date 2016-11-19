package zadanie_131;

public class Karta  extends Karty
{
private String imie, nazwisko;
private int semestr, grupa;





public Karta(String imie, String nazwisko, int semestr, int grupa)
{
	this.imie = imie;
	this.nazwisko = nazwisko;
	this.semestr = semestr;
	this.grupa = grupa;
}




@Override
public String toString()
{
	return "\n*** POLITECHNIKA £ÓDZKA ***"
			+ "\nIMIE I NAZWISKO: "+ imie+ " "+nazwisko
			+ "\nSEMESTR: "+semestr
			+ "\nGRUPA: "+grupa
			+ "\n-----------------------------"
			+ "\nKARTA WIRTUALNA"
			+ "\n-----------------------------";
	
}


}
