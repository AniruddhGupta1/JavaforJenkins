package Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.* ;

public class DateFormat1 {
	

	public static void main(String[] args) {
		Date currentDate = new Date();
	
		String str = "10/04/2022";
		DateFormat df = DateFormat.getInstance() ;
		
		
		try {
			Date d = DateFormat.getDateInstance().parse(str);
		
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(df.format(currentDate));
		//Date d = df.parse(str);
		//System.out.println(d);
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG,Locale.ENGLISH).format(currentDate));
		System.out.println(DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate));
		System.out.println(DateFormat.getInstance().format(currentDate));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL,Locale.CANADA).format(currentDate));
		System.out.println(DateFormat.getTimeInstance(DateFormat.FULL).format(currentDate));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(currentDate));
	}

}
