package zadanie_82;



public class Data
{

private int dzien, miesiac, rok;
private String styl;
public Data(int dzien, int miesiac, int rok, String styl)
{
	this.dzien = dzien;
	this.miesiac = miesiac;
	this.rok = rok;
	this.styl = styl;
}
public Data(int dzien, int miesiac, int rok)
{
	this.dzien = dzien;
	this.miesiac = miesiac;
	this.rok = rok;
	this.styl = "PL";
}
public void zmienDzien(int dzien)
{
	this.dzien = dzien;
}
public void zmienMiesiac(int miesiac)
{
	this.miesiac = miesiac;
}
public void zmienRok(int rok)
{
	this.rok = rok;
}
public void zmienStyl(String styl)
{
	this.styl = styl;
}

public String toString()
{
	
	if (styl.equals("EN"))
	{
		if(miesiac==1)
		{
	return dzien+"st of "+"January, " +rok;
		}
		else
		{
			return dzien+"th of "+"April, " +rok;
		}
	}
	else if(styl.equals("PL")){
		return dzien+" "+"kwietnia"+" "+rok;
	}
	else if(styl.equals(null))
	{
		return dzien+"."+miesiac+"."+rok;
	}
	return styl;

}



}
