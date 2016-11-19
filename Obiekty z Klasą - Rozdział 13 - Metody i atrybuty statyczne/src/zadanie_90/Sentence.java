package zadanie_90;

public class Sentence
{
String wyraz1,wyraz2,wyraz3;


	public Sentence(String wyraz1, String wyraz2, String wyraz3)
{
		
zamiana(wyraz1,wyraz2,wyraz3);
}
	public Sentence(String wyraz1, Sentence wyraz2, String wyraz3)
{
		this.wyraz1 = wyraz1+"\b";
		this.wyraz2=wyraz2.toString().toLowerCase()+"\b";
		this.wyraz3 = wyraz3.toLowerCase();

}

public void zamiana(String wyraz1, String wyraz2, String wyraz3)
{
	this.wyraz1 = wyraz1.toLowerCase();
	this.wyraz1 = this.wyraz1.substring(0, 1).toUpperCase() + this.wyraz1.substring(1);
	this.wyraz2 = wyraz2.toLowerCase();
	this.wyraz3 = wyraz3.toLowerCase();
}

	public String toString()
	{
		return wyraz1 + " " + wyraz2 + " " + wyraz3 + ".";
	}
	public static String toString(String wyraz1, String wyraz2, String wyraz3)
	{
		String s1 = wyraz1.toLowerCase();
		s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
		String s2 = wyraz2.toLowerCase();
		String s3= wyraz3.toLowerCase();
		return s1 + " " + s2 + " " + s3 + "";
	}
	public static String toString(String wyraz1, Sentence wyraz2, String wyraz3)
	{
		String s1 = wyraz1;
	
		
		String s3= wyraz3;
		return s1 + " " + wyraz2 + " " + s3 + "";
	}

	public static void main(String[] args)
	{
		Sentence s1 = new Sentence("KOT", "ma", "MYSZ");
		Sentence s2 = new Sentence("myszy", "by³y", "2");		
String x1=s1.toString();
System.out.println(x1);

String x2=Sentence.toString("Al","lubi","KoTy");
System.out.println(x2);
Sentence s3 = new Sentence(x1,s2,x2);
System.out.println(s3);
	}

}
