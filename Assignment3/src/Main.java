
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Shweta");
		p1.setAge(22);
		Person p2 = new Person();
		p2.setName("Palak");
		p2.setAge(21);
		
		Account a1= new Account();
		a1.setAccNum();
		a1.setAccHolder(p1);
		a1.setBalance(10000);
		
		Account a2= new Account();
		a2.setAccNum();
		a2.setAccHolder(p2);
		a2.setBalance(5000);
		
		System.out.println(a1);
		
		System.out.println(a2.getAccHolder());
		

	}

}
