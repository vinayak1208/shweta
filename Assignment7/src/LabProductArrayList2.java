import java.util.ArrayList;
import java.util.Scanner;


public class LabProductArrayList2 {

	public static void main(String[] args) {
	ArrayList<String> prodArr= new ArrayList<String>();
	Scanner sc= new Scanner(System.in);
	String arr=sc.nextLine();
	prodArr.add(arr);
	prodArr.add("item2");
	prodArr.add("item3");
	
	for(String out:prodArr)
	{
		System.out.println(out);
	}
sc.close();
	}

}
