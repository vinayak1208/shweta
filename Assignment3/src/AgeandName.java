import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Age
{
	public void calAge(String date)
	{
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		Date date1=null;
		try{
		date1= df.parse(date);
		}catch(ParseException e)
		{
			e.printStackTrace();
		}
	Date currentDate= new Date();
	
	long diff = currentDate.getTime() - date1.getTime();
	long diffAge= diff /(24*60*60*1000)/(30*12);
	System.out.println("Age: " + diffAge + "years");
	}
}
class Fullname
{
	public void getFullName(String fname,String lname)
	{
		String fullname= fname+ " " +lname;
		System.out.println("Name: "+ fullname);
	}
}

public class AgeandName {
public static void main(String[] args)
{
	Age a =new Age();
	Fullname f = new Fullname();
	Scanner sc= new Scanner(System.in);

	System.out.println("Enter the date of birth");
	String date = sc.next();
	System.out.println("Enter Firstname");
	String fname=sc.nextLine();
	System.out.println("Enter Lasttname");
	String lname=sc.nextLine();
	
	a.calAge(date);
	f.getFullName(fname,lname);
	sc.close();
	
	
}
}
