package Date;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.*;
public class simpleFormat1 {

	public static void main(String[] args) {
		String str = "15/04/2022";
		SimpleDateFormat sf = new SimpleDateFormat(""); {
		Date d = sf.parse(str);
		System.out.println(d);
		}
		catch (ParseException e) {e.printStackTrace();}  
		
		
		
		// TODO Auto-generated method stub

	}

}
