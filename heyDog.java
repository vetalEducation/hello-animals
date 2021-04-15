public class HeyDog {
	public static void heyDog(Dog dog) {
		System.out.println("Hey " + dog.getName() + "!");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("Sirko");
		heyDog(dog);
	}
}