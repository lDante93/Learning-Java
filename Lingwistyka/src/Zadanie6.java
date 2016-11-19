import java.util.Scanner;

public class Zadanie6
{

	int index = -1;
	static char[] c_arr;

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Wprowadü wyraøenie do analizy.");
		String wyrazenie = in.nextLine();
		c_arr = wyrazenie.toCharArray();

		Zadanie6 sprawdzenie = new Zadanie6();
		if (sprawdzenie.CheckS())
		{
			System.out.println("Wyraøenie: \"" + wyrazenie + "\" naleøy do gramatyki.");
		} else
		{
			System.out.println("Wyraøenie: \"" + wyrazenie + "\" nie naleøy do gramatyki.");
		}

	}

	public boolean CheckS()
	{
		index = -1;

		return CheckW() && CheckChar(';') && CheckZ() && index == c_arr.length - 1;
	}

	private boolean CheckZ()
	{
		int temp = index;

		if (CheckW())
		{
			return CheckChar(';') && CheckZ();
		} else
		{
			index = temp;
			return true;
		}
	}

	private boolean CheckW()
	{
		return CheckP() && CheckWprim();
	}

	private boolean CheckWprim()
	{
		int temp = index;

		if (CheckO())
		{
			return CheckW();
		} else
		{
			index = temp;
			return true;
		}
	}

	private boolean CheckP()
	{
		int temp = index;

		if (CheckR())
		{
			return true;
		} else
		{
			index = temp;
			return CheckChar('(') && CheckW() && CheckChar(')');
		}

	}

	private boolean CheckR()
	{
		return CheckL() && CheckRprim();

	}

	private boolean CheckRprim()
	{
		int temp = index;

		if (CheckChar('.'))
		{
			return CheckL();
		} else
		{
			index = temp;
			return true;
		}
	}

	private boolean CheckL()
	{
		return CheckC() && CheckLprim();

	}

	private boolean CheckLprim()
	{
		int temp = index;

		if (CheckL())
		{
			return true;
		} else
		{
			index = temp;
			return true;
		}
	}

	private boolean CheckChar(char ch)
	{
		index++;
		return index < c_arr.length && c_arr[index] == ch;
	}

	private boolean CheckC()
	{
		index++;
		return index < c_arr.length && "o0123456789".indexOf(c_arr[index]) != -1;
	}

	private boolean CheckO()
	{
		index++;
		return index < c_arr.length && "*:+-/^".indexOf(c_arr[index]) != -1;
	}

}