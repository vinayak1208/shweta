import java.util.*;
public class CheckNumber {
public static void main(String[] args)
{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to be checked");
	
	
	int num = Integer.parseInt(sc.nextLine());
	
	if(num<0)
	{
		System.out.println("The number is Negative");
	}else{
		System.out.println("The number is positive");
    }
	
}
}
