package zadanie_126;

public class Pies
{
	private long identyfikator;
	protected String imie;
	private String masc;
	private int wiek;
	private String wlasciciel;

	public Pies(long id, String imie, String masc, int wiek, String wlasciciel)
	{
		this.identyfikator = id;
		
		this.imie = imie;
		this.masc = masc;
		this.wiek = wiek;
		this.wlasciciel = wlasciciel;
	}

	@Override
	public String toString()
	{
		return "---------------------\nidentyfikator: "+ "\nIMIE: "+ imie +"\n" +sformatujIdentyfikator() + podajDaneGenealogiczne()+podajPozostaleDane();
		

	}
	
	protected String sformatujIdentyfikator()
	{
		String id =String.valueOf(this.identyfikator);
		if(id.length()==5)
		{
			id="000"+id;
		}
		else if(id.length()==4)
		{
			id="0000"+id;
		}
	
		return id;
	}
	protected String podajPozostaleDane()
	{
		 return"\nWLASCICIEL: " + wlasciciel + "\nmasc: " + masc + "\nwiek (w miesiacach): " + wiek + "\n-------------------";
	}
	private String podajDaneGenealogiczne()
	{
		return "";
	}

	}


class PiesRasowy extends Pies
{
	private String imieMatki;
	private String imieOjca;
	private String rasa;
	
	private String podajDaneGenealogiczne()
	{
		return  "\nRASA: " + rasa + "\nMATKA: " + imieMatki + "\nOJCIEC: "
				+ imieOjca ;
	}
	
	public PiesRasowy(long id, String imie, String masc, int wiek, String wlasciciel)
	{
		super(id, imie, masc, wiek, wlasciciel);
		// TODO Auto-generated constructor stub
	}

	public PiesRasowy(long id, String imie, String imieMatki, String imieOjca, String masc, int wiek, String wlasciciel,
			String rasa)
	{
		super(id, imie, masc, wiek, wlasciciel);
		this.imieMatki = imieMatki;
		this.imieOjca = imieOjca;
		this.rasa = rasa;
	}

	@Override
	public String toString()
	{
		return  "---------------------\nidentyfikator: "+super.sformatujIdentyfikator()+"\nPIES RASOWY\n"+"\nIMIE: "+ imie +podajDaneGenealogiczne()+super.podajPozostaleDane();

	}


}
