import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.swing.text.Utilities;

public class Zadanie5 
{
	public static void main(String[] args) 
	{

Scanner in = new Scanner(System.in);
String wyrazenie = in.nextLine();


		Pattern pattern = Pattern.compile("((\\d)+((\\*|\\/|\\+|\\-|\\^)(\\d)+)+\\;(\\s)*)+");
		Matcher matcher = pattern.matcher(wyrazenie);
		boolean matchFound = matcher.matches();
		if (matchFound) 
			
		{
		     System.out.println("Wyra¿enie nale¿y do gramatyki.");
		} 
		else
			System.out.println("Wyra¿enie nie nale¿y do gramatyki.");

	}
}
