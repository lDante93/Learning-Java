package zadanie_131b;

import zadanie_131.Karty;

public class Karta
{
protected String imie, nazwisko;
protected int semestr, grupa;
public boolean check =false;





public Karta(String imie, String nazwisko, int semestr, int grupa)
{
	this.imie = imie;
	this.nazwisko = nazwisko;
	this.semestr = semestr;
	this.grupa = grupa;
}

public void ustawNazwisko(String nazwisko)
{
	
	if(check==false)
	{
		
	this.nazwisko=nazwisko;
	
	}
	else if(check==true)
	{
		System.out.println("ERR: Karta jest wydrukowana.\n nie mogê zmieniæ danych osobowych.");
		
	}
	
}


public void drukuj()
{
	System.out.println("Drukowanie Karty... --> "+imie+" "+nazwisko);
	check=true;
	
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
