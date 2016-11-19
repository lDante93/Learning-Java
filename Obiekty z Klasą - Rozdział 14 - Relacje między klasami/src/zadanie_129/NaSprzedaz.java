package zadanie_129;

public class NaSprzedaz
{

private double cena;

public NaSprzedaz(double cena)
{
	this.cena = cena;
}


public String toString()
{
	return "Cena: " + cena + " zl\n";
}

public static double  podlicz(NaSprzedaz[] zestaw)
{
	double suma=0;
	for(int i=0;i<zestaw.length;i++)
	{
		suma=suma+zestaw[i].cena;
	}
	return suma;
}
}
