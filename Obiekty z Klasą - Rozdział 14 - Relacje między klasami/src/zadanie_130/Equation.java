package zadanie_130;

import java.util.Arrays;

public class Equation
{
private int[] zbior;

public Equation[] zbiory;

	public Equation(int[] t1)
	{
		this.zbior=t1;
	}
	public Equation(Equation[] tab)
	{
	
		Integer[] integerArray = Arrays.copyOf(tab, tab.length, Integer[].class);
		
		int[] primitiveArray = new int[integerArray.length];

		for(int ctr = 0; ctr < integerArray.length; ctr++) {
		    primitiveArray[ctr] = integerArray[ctr].intValue(); // returns int value
		}
		this.zbior=primitiveArray;
	
		
		
		
		
	}
	@Override
	public String toString()
	{

		return zbior[0]+"x"+" + "+zbior[1]+"y"+" = "+zbior[2];
	}
	
public int getX()
{
	return zbior[0];
}
public int getY()
{
	return zbior[1];
}
public int getC()
{
	return zbior[2];
}
}
