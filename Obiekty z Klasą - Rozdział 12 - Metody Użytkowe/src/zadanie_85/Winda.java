
package zadanie_85;

public class Winda
{
	String ulica;
	int maxOsob, udzwig;
	int pietro, liczbaPasazerow;

	public Winda(String ulica, int maxOsob, int udzwig)
	{
		this.ulica = "ul. " + ulica;
		this.maxOsob = maxOsob;
		this.udzwig = udzwig;
	}

	public Winda(String ulica)
	{
		this.ulica = "ul. " + ulica;
	}

	public Winda()
	{
		this.ulica = "";

	}

	public int leave(int i)
	{
		if (liczbaPasazerow != 0)
		{
			liczbaPasazerow = liczbaPasazerow - i;
			System.out.println("<--- Na pietrze 0, wysiadlo "+i+" pasazerow\n");

		} else if (!ulica.isEmpty() && liczbaPasazerow == 0 && !(udzwig > 0))
		{
			System.out.println("ERR: Winda nieczynna");
		} else if (!ulica.isEmpty() && liczbaPasazerow == 0)
		{
			System.out.println("ERR: Winda pusta: nikt nie mo¿e wysiac");
		} else
		{
			System.out.println("ERR: Winda niezamontowana");
		}
		return liczbaPasazerow;
	}

	public int comeIn(int i)
	{
		if (i < maxOsob-liczbaPasazerow)
		{
			if (!ulica.isEmpty() && (udzwig > 0))
			{
				liczbaPasazerow = +i;
				System.out.println("\n---> Na piêtrze 0, wsiadlo " + liczbaPasazerow + " pasazerow\n");
			}

			else if (!ulica.isEmpty())
			{
				System.out.println("ERR: Winda nieczynna");
			} else
			{
				System.out.println("ERR: Winda niezamontowana");
			}
		} else
		{
			if (!ulica.isEmpty() && (udzwig > 0))
			{
				liczbaPasazerow = liczbaPasazerow+(maxOsob-i);
			System.out.println("Na pietrze 0, chcialo wsiasc "+i+" osob\nWsiadlo tylko "+(maxOsob-i)+" pasazerow\n");
			}
		}
		return liczbaPasazerow;
	}

	public String toString()
	{
		if (udzwig > 0)
		{
			return "-----------------------------" + "\nWINDA ZAMONTOWANA NA:\n"

					+ ulica + "\nPARAMETRY\n"

					+

					"UDZWIG: " + udzwig + " kg\nMax. osob: " + maxOsob + "\n--------------------\n";
		} else
			return "-----------------------------" + "\nWINDA ZAMONTOWANA NA:\n" + ulica +

					"\nPARAMETRY NIEZNANE" + "\n--------------------\n";

	}

	public void printStatus()
	{
		if (udzwig > 0 && maxOsob > 0)
		{
			System.out.print("-----------------------\n" + "WINDA SPRAWNA, stoi na pietrze " + pietro
					+ "\nliczba pasazerow: " + liczbaPasazerow + "\n----------------------\n\n");
		} else if (!(ulica.isEmpty()))
		{
			System.out.print("-----------------------\n" + "WINDA SPRAWNA, stoi na pietrze " + pietro
					+ "\nWINDA NIECZYNNA (brak parametrow)" + "\n----------------------\n\n");
		} else
		{
			System.out.print("-----------------------\n" + "WINDA NIEZAMONTOWANA" + "\n----------------------\n\n");
		}

	}

}