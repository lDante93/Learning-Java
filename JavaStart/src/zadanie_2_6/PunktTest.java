package zadanie_2_6;

public class PunktTest
{

	public static void main(String[] args)
	{
		
		Punkt2D punkt[] = new Punkt2D[3];
		punkt[0] = new Punkt2D();
		punkt[1]  = new Punkt2D(1,2);
		punkt[2]  = new Punkt3D(2,3,4);
		Punkt3D punktx=new Punkt3D(5,6,7);
		
		for(Punkt2D e: punkt)
		System.out.println(e.x+" "+e.y+"");
		
		
		System.out.println(punktx.x+""+punktx.y+""+punktx.z);
	}

}
