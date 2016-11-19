

public class Zadanie_5_4_ArgWspak
{

	public static void main(String[] args)
	{
		
		
//		for (String argument:args)
//		{
//			for (int j = argument.length() - 1; j >= 0; j--)
//			{
//				System.out.print(argument.charAt(j));
//			}
//			System.out.println("");
//		}
		int temp;
		for (int i =0;i<args.length;i++)
		{
	
			for (int j = args[i].length()-1; j >= 0; j--)
			{
				System.out.print(args[i].charAt(j));
			}
			System.out.println("");
		}

	}

}
