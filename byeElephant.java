public class ByeElephant {
	public static void ByeElephant(Elephant cat) {
		System.out.println("Bye " + cat.getName());
	}
	
	public static void main(String[] args) {
		Elephant cat = new Elephant("Buggi");
		ByeElephant(cat);
	}
}