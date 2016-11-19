package zadanie_88;

public class Trojmian
{

	// public static final Trojmian PIERWIASTKI ;
	// public static final Trojmian MINIMUM ;
	private int a, b, c, x1, x2, delta, minimum, minimum2;
	public final static int PIERWIASTKI = 1;
	public static final int MINIMUM = 2;

	public Trojmian(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void wyswietl(int argument)
	{
		if (Trojmian.PIERWIASTKI == argument)
		{
			if (a != 0)
			{
				delta = b * b - 4 * a * c;

				x1 = (int) (-b - (Math.sqrt(delta))) / 2 * a;
				x2 = (int) (-b + (Math.sqrt(delta))) / 2 * a;
				System.out.println("Pierwiastki: " + x2 + ", " + x1);
			} else
			{
				x2 = -c / b;
				System.out.println("Pierwiastki: " + x2);
			}
		} else if (Trojmian.MINIMUM == argument)
		{
			minimum = -b / 2 * a;
			minimum2 = -delta / 4 * a;
			System.out.println("Minimum: w x=" + minimum + ", f(x)=" + minimum2);
		}

	}

	public String toString()
	{
		if (delta == 0)
		{
			x2=-b/2*a;
			
			return "\nTrojmian kwadratowy "  + "x^2+" + b + "x" + c + "\n\tPierwiastki: " + x2
					+ "\n\t\tMinimum: brak \n";
		} else
		{
			if (a != 1)
			{
				if (a == -1)
				{
					return "\nTrojmian kwadratowy " + "-x^2+" + b + "x" + c + "\n\tPierwiastki: " + x2 + ", " + x1
							+ "\n\t\tMinimum: w x=" + minimum + ", f(x)=" + minimum2 + "\n";
				}

				else if (a != 0)
				{
					return "\nTrojmian kwadratowy " + a + "x^2+" + b + "x" + c + "\n\tPierwiastki: " + x2 + ", " + x1
							+ "\n\t\tMinimum: w x=" + minimum + ", f(x)=" + minimum2 + "\n";
				}

				else
				{
					return "\nZale¿nosc liniowa: " + b + "x" + c + "\n\tPierwiastki: " + x2 + "\n\t\tMinimum: brak";
				}
			}

			else
			{
				
				if(b!=0){
				return "\nTrojmian kwadratowy " + "x^2+" + b + "x" + c + "\n\tPierwiastki: " + x2 + ", " + x1
						+ "\n\t\tMinimum: w x=" + minimum + ", f(x)=" + minimum2 + "\n";
				}
				else
				{
					return "\nTrojmian kwadratowy " + "x^2+"  + c + "\n\tPierwiastki: " + x2 + ", " + x1
							+ "\n\t\tMinimum: w x=" + minimum + ", f(x)=" + minimum2 + "\n";
				}
			}
		}
	}

	public void zmienCzynnik(int i, int j)
	{
		if (i == 1)
		{
			this.a = j;
		} else if (i == 2)
		{
			this.b = j;
		} else if (i == 3)
		{
			this.c = j;
		}
	}
}
