package zadanie_84;

public class Winda
{
	String ulica;
	int maxOsob, udzwig;
	int pietro, liczbaPasazerow;

	public Winda(String ulica, int maxOsob, int udzwig)
	{
		this.ulica = "ul. "+ulica;
		this.maxOsob = maxOsob;
		this.udzwig = udzwig;
	}

	public Winda(String ulica)
	{
		this.ulica = "ul. "+ulica;
	}

	public Winda()
	{
		this.ulica="";
		
	}

	public String toString()
	{
		if(udzwig>0){
		return "-----------------------------" + "\nWINDA ZAMONTOWANA NA:\n"

				+ ulica + "\nPARAMETRY\n"

				+

				"UDZWIG: " + udzwig + " kg\nMax. osob: " + maxOsob+"\n--------------------\n";
		}
		else
		return "-----------------------------" + "\nWINDA ZAMONTOWANA NA:\n"+ ulica +

				"\nPARAMETRY NIEZNANE"+"\n--------------------\n";

	}
	
	
	public void printStatus()
	{
	if(udzwig >0&&maxOsob>0){
		System.out.print("-----------------------\n"
				+"WINDA SPRAWNA, stoi na pietrze " +pietro+
				"\nliczba pasazerow: "+liczbaPasazerow+
	"\n----------------------\n\n");
	}
	else if(!(ulica.isEmpty()))
	{
		System.out.print("-----------------------\n"
				+"WINDA SPRAWNA, stoi na pietrze " +pietro+
				"\nWINDA NIECZYNNA (brak parametrow)"+
	"\n----------------------\n\n");
	}
	else 
	{
		System.out.print("-----------------------\n"
				+"WINDA NIEZAMONTOWANA"+
	"\n----------------------\n\n");
	}
		
		
	}
	
}