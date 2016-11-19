package zadanie_128;

public class Utwor
{
	private String tytul,wykonawca;
	private int minuty,sekundy;
	
	
	public Utwor(String tytul, String wykonawca, int minuty, int sekundy)
	{
		this.tytul = tytul;
		this.wykonawca = wykonawca;
		this.minuty = minuty;
		this.sekundy = sekundy;
	}


	@Override
	public String toString()
	{
		return "\n----------------------------"
				+"\ntytul: "+tytul
				+"\nwykonawca: "+wykonawca
				+"\nczas trwania: "+minuty+":"+sekundy
				+"\n----------------------------";
	}
	
	
}
