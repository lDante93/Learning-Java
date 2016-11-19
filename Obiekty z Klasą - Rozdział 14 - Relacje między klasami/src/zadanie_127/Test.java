package zadanie_127;

public class Test
{

	public static void main(String[] args)
	{
	Book ks[]={ 
				new Book (13,2, "Rhonda Byrne", "Sekret"), 
				new Book(12, 1, "Graham Greene", "Monsignore Kichote"),
				new Book(19, 3, "Hugo Steinhaus", "Slownik racjonalny"),
				new Book(10, 4, "RE.M. Remarque", "Trzej towarzysze"), 
				new Book(13, 3, "A.A. Milne", "Kubus Puchatek"),
				new Book(11, 4, "Paulo Coelho", "El Aquimista"), 
				new Book(13, 5, "Mitch Albom", "Tuesday with Morrie"),
				new Book(11, 2, "John Fowles", "Mag"), 
			   };
	
		Shelf s = new Shelf(ks, 15);
		System.out.println(s);
	}

}
