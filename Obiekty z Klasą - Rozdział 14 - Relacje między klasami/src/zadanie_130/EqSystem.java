package zadanie_130;

import java.util.ArrayList;
import java.util.Arrays;

public class EqSystem
{
	private Equation[] zbior2;
	private Equation zbior3;
	public static int numer = 101;
	public Equation zbiorx;
	public String toString()
	{

//		StringBuilder zbior2String = new StringBuilder();
//		for (int i = 0; i < zbior2.length; i++)
//		{
//			zbior2String.append(zbior2[i].toString()+"\n");
//		}
		
		return "("+numer+")\n"+zbiorx.toString();
	}

	public EqSystem(Equation[] tab)
{
//	this.zbior2=tab;
	zbiorx = new Equation(tab);
}

	public EqSystem(int[]t1, int[]t2)
{
//	this.zbior2=tab;
	zbiorx = new Equation(t1);
}
	
	
	
	
	
	
	
	public static void setNextNumber(int numer)
	{
	EqSystem.numer=numer;
	}
//	public String getSolution()
//	{
//
//	double x1=zbior2[0].getX();
//	double y1=zbior2[0].getY();
//	double c1=zbior2[0].getC();
//	double x2=zbior2[1].getX();
//	double y2=zbior2[1].getY();
//	double c2=zbior2[1].getC();
//	y1=-x1/y1;
//	double X=c2/(y2*y1+x2);
//	 x1=zbior2[0].getX();
//	 y1=zbior2[0].getY();
//	 c1=zbior2[0].getC();
//	x2=zbior2[1].getX();
//	 y2=zbior2[1].getY();
//	 c2=zbior2[1].getC();
//			x1=-y1/x1;
//	double Y=c2/(x2*x1+y2);
//		
//		return "Uklad ("+numer+") ma dokladnie jedno rozwiazanie: x="+X+", y="+Y;
//	}
}
