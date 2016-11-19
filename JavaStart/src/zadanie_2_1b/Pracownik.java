package zadanie_2_1b;

public class Pracownik
{
String imiê;
String nazwisko;
int wiek;


public Pracownik()
{
	System.out.println("Nie podano jeszcze wartoœci");
}
public void setImiê(String i)
{
	imiê =i;
}
public void setNazwisko(String n)
{
	nazwisko =n;
}
public void setWiek(int w)
{
	wiek =w;
}


public String getImiê()
{
	return imiê;
}
public String getNazwisko()
{
	return nazwisko;
}
public int getWiek()
{
	return wiek;
}
}