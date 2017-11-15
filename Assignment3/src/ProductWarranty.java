import java.time.LocalDate;
import java.util.Scanner;


public class ProductWarranty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product year");
		int year= sc.nextInt();
		System.out.println("Enter product month");
		int month = sc.nextInt();
		
		LocalDate productDate = LocalDate.of(year, month, 1);
		System.out.print("Enter warranty period in years");
		long eyear=sc.nextLong();
		
		LocalDate exDate = productDate.plusYears(eyear);
		
		System.out.println(exDate);
		sc.close();
	}

}
