package zadanie_125;

public class Test
{

	public static void main(String[] args)
	{
		Figura sumaNieszczesc[] ={
				new Kwadrat(5,"czerwony"), 
				new WielokatForemny(8,2,"szary"),				
				new Kolo (6,"fioletowy"),
				new WielokatForemny(12,5,"bialy"),
				new Trojkat (7,4,6,"niebieski"),
		};
		for (int i=0; i<sumaNieszczesc.length;i++)
		{
			System.out.println("\n"+sumaNieszczesc[i]);
		}

	}



}
