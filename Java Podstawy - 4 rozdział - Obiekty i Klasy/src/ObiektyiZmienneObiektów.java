import java.util.Arrays;
import java.util.Date;

/*
 * @author £ukasz Franczyk
 * @param deadline dupa
 * @since 1.9
 */
public class ObiektyiZmienneObiektów {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		
		String e = new Date().toString();
		System.out.println(e);
		
		Date deadline;
		Date deadline2;
		//System.out.println(deadline);
		deadline = new Date();
		deadline2 =deadline;
		System.out.println(deadline);
		System.out.println(deadline2);
	}

}
