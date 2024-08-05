public class Maximizer {

	//The reason why this results in a compilation error is because this line assumes that the > operator works with arbitrary Object types, when in fact it does not.
	//In python or C++, > operator can be used such that it works with object types, but not Java
	/*
	public static Object max(Object[] items) {
		int maxDex = 0;
		for (int i = 0; i < items.length; i += 1) {
			if (items[i] > items[maxDex]) { // trying to take advantage of the fact that very object extend the Object class, but it won't work
				maxDex = i;
			}
		}
		return items[maxDex];
	}*/

	public static OurComparable max(OurComparable[] items) {
		int maxDex = 0;
		for (int i = 0; i < items.length; i += 1) {
			int cmp = items[i].compareTo(items[maxDex]);
			if (cmp > 0) {
				maxDex = i;
			}
		}
		return items[maxDex];
	}

	public static void main(String[] args) {
		Dog[] dogs = {new Dog("Elyse", 3), new Dog("Sture", 5), new Dog("Benjamin", 15)};
		Dog maxDog = (Dog) max(dogs);
		maxDog.bark();
	}

}

