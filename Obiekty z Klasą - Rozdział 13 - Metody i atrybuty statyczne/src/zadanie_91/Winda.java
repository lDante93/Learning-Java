package zadanie_91;

public class Winda
{
	String ulica;
	int maxOsob, udzwig;
	int pietro, liczbaPasazerow;
	static String seria="XB";
	int numer;
	static int nextId=9998;

	public Winda(String ulica, int maxOsob, int udzwig)
	{
		numer=nextId;
		nextId++;
		if(numer==10000){
			this.numer=0001;
			seria="XC";
		}
		this.ulica = "ul. "+ulica;
		this.maxOsob = maxOsob;
		this.udzwig = udzwig;
		
	}

	public Winda(String ulica)
	{
		this(ulica,0,0);
	}

	public Winda()
	{
		this("");
		
	}

	public String toString()
	{
		if(udzwig>0){
		return "-----------------------------" + "\nWINDA ZAMONTOWANA NA:\n"

				+ ulica + "\nPARAMETRY\n"

				+

				"UDZWIG: " + udzwig + " kg\nMax. osob: " + maxOsob + " \nSERIA: "+ seria + " \nNUMER: "+numer+"\n--------------------\n";
		}
		else
		return "-----------------------------" + "\nWINDA ZAMONTOWANA NA:\n"+ ulica + " \nSERIA: "+ seria + " \nNUMER: "+numer+

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