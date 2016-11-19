package zadanie_128;

public class UtworMP3 extends Utwor
{
private String nazwaPliku;
private double rozmiar;
public UtworMP3(String tytul, String wykonawca,  String nazwaPliku, double rozmiar, int minuty, int sekundy)
{
	super(tytul, wykonawca, minuty, sekundy);
	this.nazwaPliku = nazwaPliku;
	this.rozmiar = rozmiar;
}
@Override
public String toString()
{
	return  "                           MP3"+
			"\n----------------------------"
			+"\nazwaPliku: "+nazwaPliku
			+"\nnrrozmiar: "+rozmiar
			+super.toString();
}


}
