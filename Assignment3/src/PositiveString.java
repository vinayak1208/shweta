import java.util.Scanner;


public class PositiveString {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc= new Scanner(System.in);
		String pstring = sc.nextLine();
		int flag=0;
		for(int counter=0;counter<pstring.length()-1;counter++)
		{
			if(pstring.charAt(counter+1)<pstring.charAt(counter))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("The String is positive");
		}else
		{
			System.out.println("The String is negative");
			
		}
		sc.close();
	}

}
