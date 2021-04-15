public class HeyCat {
	public static void heyCat(Cat cat) {
		System.out.println("Hey " + cat.getName() + "!");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat("Kitsko");
		heyCat(cat);
	}
}