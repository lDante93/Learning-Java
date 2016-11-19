package zadanie_131;

public class Karta23 extends Karty
{


	private String specjalnosc;
private Karta informacje;




public Karta23(String imie, String nazwisko, int semestr, int grupa,String specjalnosc)
{
	this.informacje=new Karta(imie,nazwisko,semestr,grupa);
	this.specjalnosc = specjalnosc;
}




@Override
public String toString()
{
	return "Karta23 [specjalnosc=" + specjalnosc + ", informacje=" + informacje + "]";
}



}
