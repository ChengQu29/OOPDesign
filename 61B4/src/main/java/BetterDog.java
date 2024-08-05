public class BetterDog implements Comparable<BetterDog> {

	private String name;
	private int size;

	public BetterDog(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public void bark() {
		System.out.println(name + " says: bark");
	}

	//returns negative number if this dog is less than the dog pointed at by o
	public int compareTo(BetterDog uddaDog) {
		// No more type cast !!!
		return this.size - uddaDog.size;
	}
}
