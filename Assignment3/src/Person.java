
public class Person {
	private String name;
	private float age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	

}
