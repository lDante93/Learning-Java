package zadanie_2_1b;

public class Pracownik
{
String imi�;
String nazwisko;
int wiek;


public Pracownik()
{
	System.out.println("Nie podano jeszcze warto�ci");
}
public void setImi�(String i)
{
	imi� =i;
}
public void setNazwisko(String n)
{
	nazwisko =n;
}
public void setWiek(int w)
{
	wiek =w;
}


public String getImi�()
{
	return imi�;
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