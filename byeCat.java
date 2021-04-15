public class ByeCat {
	public static void ByeCat(Cat cat) {
		System.out.println("Bye " + cat.getName());
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat("Kitsko");
		ByeCat(cat);
	}
}