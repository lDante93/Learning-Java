package zadanie_135;

public class FormatowanyString implements Formatowalne
{
String nazwa;
int x;





@Override
public String toString()
{
	return nazwa;
}





public FormatowanyString(String nazwa, int x)
{
	this.nazwa = nazwa;
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
		return this.toString();
}
}