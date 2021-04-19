public class ByePig {
	public static void ByePig(Pig dog) {
		System.out.println("Bye " + dog.getName());
	}
	
	public static void main(String[] args) {
		Pig dog = new Pig("Kitsko");
		ByePig(dog);
	}
}