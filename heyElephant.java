public class HeyElephant {
	public static void heyElephant(Elephant elephant) {
		System.out.println("Hey " + elephant.getName() + "!");
	}
	
	public static void main(String[] args) {
		Elephant elephant = new Elephant("Buggi");
		heyElephant(elephant);
	}
}