package zadanie_134;

public class FormatowanyInt implements Formatowalne
{
int liczba;
int x;





public FormatowanyInt(int liczba, int x)
{
	this.liczba = liczba;
	this.x = x;
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

