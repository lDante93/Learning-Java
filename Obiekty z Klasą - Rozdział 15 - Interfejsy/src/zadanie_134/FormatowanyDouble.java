package zadanie_134;

public class FormatowanyDouble implements Formatowalne
{
double liczba;
int x;
int przecinek;


	

public FormatowanyDouble(double liczba, int x, int przecinek)
{
	this.liczba = liczba;
	this.x = x;
	this.przecinek=przecinek;
}



public String srodek()
{
	return "        ";
}

public String prawo()
{
	return "                    ";
}

@Override
public String zwrocWyrownany(int jak)
{
	if(jak==1)
	{
	return srodek()+this.toString()+prawo();
	}
	else if(jak==2)
	{
		return prawo()+this.toString()+prawo();
	}
	else
		return"s";
}
@Override
public String toString()
{
	return String.valueOf(liczba);
}
}
