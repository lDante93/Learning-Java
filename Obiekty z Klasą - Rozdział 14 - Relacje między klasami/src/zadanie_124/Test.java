package zadanie_124;

public class Test
{

	public static void main(String[] args)
	{
		Figura sumaNieszczesc[] ={
				new Kwadrat(5,"czerwony"), new Trapez (10,8,4,"pistacjowy"),
				new Prostokat (7,10,"szary"),
				new Kolo (6,"fioletowy"),
				new Trojkat (7,4,6,"niebieski"),
		};
		for (int i=0; i<sumaNieszczesc.length;i++)
		{
			System.out.println("\n"+sumaNieszczesc[i]);
		}

	}



}
