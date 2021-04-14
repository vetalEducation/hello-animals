public class Cat {
	private String name;
	private int age;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public Cat(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Cat {" + "name = '" + name + "', age = " + age + '}';
	}
}