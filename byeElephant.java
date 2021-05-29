public class ByeElephant {
	public static void ByeElephant(Elephant elephant) {
		System.out.println("Bye " + elephant.getName());
	}
	
	public static void main(String[] args) {
		Elephant elephant = new Elephant("Buggi");
		ByeElephant(elephant);
	}
}