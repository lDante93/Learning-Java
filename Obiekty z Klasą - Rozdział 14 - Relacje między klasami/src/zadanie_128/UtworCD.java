package zadanie_128;

public class UtworCD extends Utwor
{
	private String nazwaPlyty;
	private int nrSciezki;
public UtworCD(String nazwaPlyty,String tytul, String wykonawca, int nrSciezki, int minuty, int sekundy)
	{
		super(tytul, wykonawca, minuty, sekundy);
		this.nazwaPlyty = nazwaPlyty;
		this.nrSciezki = nrSciezki;
	}
@Override
public String toString()
{
	return  "                           CD"+
			"\n----------------------------"
			+"\nazwaPlyty: "+nazwaPlyty
			+"\nnrSciezki: "+nrSciezki
			+super.toString();
}




}
