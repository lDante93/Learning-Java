package zadanie_77;

public class GoldNumber
{
	private String imie;
	private int id, x, y, z;

	public GoldNumber(String imie, int id, int x, int y, int z)
	{
		super();
		this.imie = imie;
		this.id = id;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public GoldNumber(String imie, int id, int x, int y)
	{
		super();
		this.imie = imie;
		this.id = id;
		this.x = x;
		this.y = y;
		this.z=y;
	}

	public GoldNumber(String imie, int id, int x)
	{
		this.imie = imie;
		this.id = id;
		this.x = x;
		this.y=x;
		this.z=y;
	}


	public void wyswietl()
	{
		System.out.printf("%s:\n%7d %3$d%3$d-%4$d%4$d-%5$d%5$d \n", imie, id, x, y, z);
	}

	public void zmienCyfre(int a, int b)
	{
		if (a == 1)
		{
			this.x = b;
		}

		else if (a == 2)
		{
			this.y = b;
		} else if (a == 3)
		{
			this.z = b;
		}
	}

}
