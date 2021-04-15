public class ByeDog {
	public static void ByeDog(Dog dog) {
		System.out.println("Bye " + dog.getName());
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("Kitsko");
		ByeDog(dog);
	}
}