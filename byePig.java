public class ByePig {
	public static void ByePig(Pig pig) {
		System.out.println("Bye " + pig.getName());
	}
	
	public static void main(String[] args) {
		Pig pig = new Pig("Kabanchik");
		ByePig(pig);
	}
}