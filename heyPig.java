public class HeyPig {
	public static void heyDog(Pig pig) {
		System.out.println("Hey " + pig.getName() + "!");
	}
	
	public static void main(String[] args) {
		Pig pig = new Pig("Kabanchik");
		heyDog(pig);
	}
}