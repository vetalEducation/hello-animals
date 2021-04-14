public class HeyDog {
	public static void heyCat(Dog dog) {
		System.out.println("Hey " + dog.getName());
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("Sirko");
		heyDog(dog);
	}
}