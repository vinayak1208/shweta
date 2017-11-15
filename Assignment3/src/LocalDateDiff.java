
import java.time.LocalDate;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class LocalDateDiff {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First date year");
		int year1=sc.nextInt();
		System.out.println("Enter First date month");
		int month1=sc.nextInt();
		System.out.println("Enter First date day");
		int days1=sc.nextInt();
		
		LocalDate date1= LocalDate.of(year1,month1,days1);
		
		System.out.println("Enter Second date year");
		int year2=sc.nextInt();
		System.out.println("Enter Second date month");
		int month2=sc.nextInt();
		System.out.println("Enter Second date day");
		int days2=sc.nextInt();
		
		LocalDate date2= LocalDate.of(year2,month2,days2);
		
		long daysBetween = ChronoUnit.DAYS.between(date1, date2);
		long monthsBetween = ChronoUnit.MONTHS.between(date1, date2);
		long yearsBetween = ChronoUnit.YEARS.between(date1, date2);
		System.out.println("No of days:"+daysBetween);
		System.out.println("No of months:"+monthsBetween);
		System.out.println("No of years:"+yearsBetween);
		
		
		sc.close();
		
		
		
		
		
	}

}
