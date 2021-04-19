public class HeyPig {
	public static void heyPig(Pig pig) {
		System.out.println("Hey " + pig.getName() + "!");
	}
	
	public static void main(String[] args) {
		Pig pig = new Pig("Kabanchik");
		heyPig(pig);
	}
}