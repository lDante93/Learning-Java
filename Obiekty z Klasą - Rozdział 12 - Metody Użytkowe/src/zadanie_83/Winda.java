package zadanie_83;

public class Winda
{
	String ulica;
	int maxOsob, udzwig;

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
		
		this.ulica="\b";
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
}