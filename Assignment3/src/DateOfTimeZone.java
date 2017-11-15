import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class DateOfTimeZone {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat df= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter time zone name");
		String zone= sc.nextLine();
		df.setTimeZone(TimeZone.getTimeZone(zone));
		System.out.println("Date and time in "+ zone + df.format(date));
	
	sc.close();
	}

}
