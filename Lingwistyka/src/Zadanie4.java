
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.swing.text.Utilities;

public class Zadanie4 
{
	public static void main(String[] args) 
	{

Scanner in = new Scanner(System.in);
String wyrazenie = in.nextLine();


	Pattern EmailPattern = Pattern.compile("(\\w+_*\\.*-*)+@\\w+\\.[a-z]+");
	Matcher EmailMatcher = EmailPattern.matcher(wyrazenie);
	boolean EmailMatchFound = EmailMatcher.matches();
	
	Pattern IpPattern = Pattern.compile("((([0-9])|([1-9][0-9])|([1][0-9][0-9])|([2][0-5][0-5]))\\.){3}(([0-9])|([1-9][0-9])|([1][0-9][0-9])|([2][0-5][0-5]))(\\s){1}((([0-9])|([1-9][0-9])|([1][0-9][0-9])|([2][0-5][0-5]))\\.){3}(([0-9])|([1-9][0-9])|([1][0-9][0-9])|([2][0-5][0-5]))");
	Matcher IpMatcher = IpPattern.matcher(wyrazenie);
	boolean IpMatchFound = IpMatcher.matches();
	
	Pattern IntegerPattern = Pattern.compile("([0-9]+\\s*\\+\\s*[0-9]+)+");
	Matcher IntegerMatcher = IntegerPattern.matcher(wyrazenie);
	boolean IntegerMatchFound = IntegerMatcher.matches();	
	
	Pattern ComplexPattern = Pattern.compile("((([0-9])*\\s*(\\+)*\\s*([0-9]*\\s*i)*\\s*\\+)+(\\s*[0-9]*\\s*(\\+)*\\s*([0-9]*\\s*i)*)+)+");
	Matcher ComplexMatcher = ComplexPattern.matcher(wyrazenie);
	boolean ComplexMatchFound = ComplexMatcher.matches();	
	
	Pattern HtmlPattern = Pattern.compile("<b>.*</b>");
	Matcher HtmlMatcher = HtmlPattern.matcher(wyrazenie);
	boolean HtmlMatchFound = HtmlMatcher.matches();	
	
	Pattern Html2Pattern = Pattern.compile("<table>(<tr>(<td>.*</td>)*</tr>)*</table>");
	Matcher Html2Matcher = Html2Pattern.matcher(wyrazenie);
	boolean Html2MatchFound = Html2Matcher.matches();	
	
	 System.out.print("Wprowadzone wyra¿enie: \"" +wyrazenie);
	
	if (EmailMatchFound) 
		
	{
	     System.out.println("\" jest adresem e-mail.");
	} 
	else if (IpMatchFound) 
	{
	     System.out.println("\" jest adresem IP.");
	} 
	else if (IntegerMatchFound) 
	{
	     System.out.println("\" jest sumowaniem liczb ca³kowitych.");
	} 
	else if (HtmlMatchFound) 
	{
	     System.out.println("\" jest poprawnym tagiem HTML -> <b>.");
	} 
	else if (Html2MatchFound) 
	{
	     System.out.println("\" jest poprawnym tagiem HTML -> <table>");
	} 
	else
	{
	     System.out.println("\" nie pasuje do ¿adnego wyra¿enia regularnego.");
	}
	
	

	}
}
