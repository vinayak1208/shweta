	enum gender
	{
		M,F;
	}
public class Person {

	private String fname;
	private String lname;
    gender g;
	Person()
	{
		
		
	}
	public Person(String fname, String lname) {
		
		this.fname = fname;
		this.lname = lname;
	
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setGender(gender gender) {
		g=gender;
		
	}
	public gender getGender() {
	
		return g;
	}
	
	
	
	

}
