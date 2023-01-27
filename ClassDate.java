package Date;
import java .util.*;

public class ClassDate {

	public static void main(String[] args) {
		Long time = System.currentTimeMillis() ;// prints time from 1970 to now , this is static method in java.lang package system class
		System.out.println(time);
		Date date = new Date ();// date class only have two constructors one default and one milisecond 
		System.out.println(date);
		Date date1 = new Date(time);
		System.out.println(date1);
		
		Date date3 = new Date(1947,8,14);
		System.out.println(date.after(date3));
	}
}