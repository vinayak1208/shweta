import java.util.Scanner;
public class PersonDetails{
public static void main(String[] args)
{




	Scanner sc= new Scanner(System.in);
	Person p = new Person();
	String fname=sc.nextLine();
	p.setFname(fname);
	
	String lname=sc.nextLine();
	p.setLname(lname);
	

	gender g=gender.valueOf(sc.nextLine());
	p.setGender(g);
/*	System.out.println("Enter Age:");
	int age=sc.nextInt();
	
	System.out.println("Enter Weight:");
	float weight=sc.nextFloat();
	
	System.out.println("Personal Details");
	System.out.println("________________\n\n");*/
	
    System.out.println("First Name:"+p.getFname()+"\n"+"Last Name:"+p.getLname()+"\n"+
    "Gender:"+p.getGender());
    //+"Age:"+age+"\n"+"Weight:"+weight);	
	
	sc.close();
}
}
