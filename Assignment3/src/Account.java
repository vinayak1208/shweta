
public class Account {

	private static long accNum=101;
	private double balance;
	private Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum() {
		++accNum;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accHolder=" + accHolder
				+ ", getAccNum()=" + getAccNum() + ", getBalance()="
				+ getBalance() + ", getAccHolder()=" + getAccHolder()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double money)
	{
		balance=balance+money;
	
	}
	public void withdraw(double money)
	{
		balance=balance-money;
	}
	

}
