import java.util.Comparator;

public class Dog implements OurComparable {

	private String name;
	private int size;

	public Dog(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public void bark() {
		System.out.println(name + " says: bark");
	}

	//returns negative number if this dog is less than the dog pointed at by o
	public int compareTo(Object o) {
		/** Warning, cast can cause runtime error */
		Dog uddaDog = (Dog) o;
		return this.size - uddaDog.size;
	}

	//nested class in order to use Comparator
	private static class NameComparator implements Comparator<Dog> {
		public int compare(Dog a, Dog b) {
			return a.name.compareTo(b.name); //compareTo method belong to String class

		}
	}

	//my mistake when I first wrote it
//	public NameComparator getNameComparator() {
//		return new NameComparator();
//
//	}

	public static Comparator<Dog> getNameComparator() {
		return new NameComparator();

	}
}
