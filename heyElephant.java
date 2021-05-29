public class HeyElephant {
	public static void heyElephant(Elephant cat) {
		System.out.println("Hey " + cat.getName() + "!");
	}
	
	public static void main(String[] args) {
		Elephant cat = new Elephant("Buggi");
		heyElephant(cat);
	}
}