package zadanie_129;

public class Book extends NaSprzedaz
{
private String tytul, autor;

public Book(String tytul, String autor,double cena)
{
	super(cena);
	this.tytul = tytul;
	this.autor = autor;
}


public String toString()
{
	return "Tytul: " + tytul + "\nAutor: " + autor + "\n" + super.toString();
}


}
