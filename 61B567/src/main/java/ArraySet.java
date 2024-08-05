import java.util.Iterator;

public class ArraySet<T> implements Iterable<T> {
	private T[] items;
	private int size; // the next item to be added will be at position size

	public ArraySet() {
		items = (T[]) new Object[100];
		size = 0;
	}

	/* Returns true if this map contains a mapping for the specified key.
	 */
	public boolean contains(T x) {
		for (int i = 0; i < size; i += 1) {
			if (items[i].equals(x)) {
				return true;
			}
		}
		return false;
	}

	/* Associates the specified value with the specified key in this map. */
	public void add(T x) {
		if (x == null) {
			throw new IllegalArgumentException("Cannot add null");
		}
		if (contains(x)) {
			return;
		}
		items[size] = x;
		size += 1;
	}

	/* Returns the number of key-value mappings in this map. */
	public int size() {
		return size;
	}

	/** returns an iterator (a.k.a. seer) into ME */
	public Iterator<T> iterator() {
		return new ArraySetIterator();
	}

	private class ArraySetIterator implements Iterator<T> {
		private int wizPos;

		public ArraySetIterator() {
			wizPos = 0;
		}

		public boolean hasNext() {
			return wizPos < size;
		}

		public T next() {
			T returnItem = items[wizPos];
			wizPos += 1;
			return returnItem;
		}
	}

	@Override
	public String toString() { //comment out this method and run test to see what happens
		StringBuilder returnSB = new StringBuilder("{");
		for (int i = 0; i < size - 1; i += 1) {
			returnSB.append(items[i].toString());
			returnSB.append(", ");
		}
		returnSB.append(items[size - 1]);
		returnSB.append("}");
		return returnSB.toString();
	}

	@Override
	public boolean equals(Object other) { //comment out this method and run test to see what happens
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;
		}
		if (other.getClass() != this.getClass()) {
			System.out.println("calling other.getClass(): "+ other.getClass());
			System.out.println("calling this.getClass(): "+ this.getClass()); //this keyword returns the current instance of the class
			return false;
		}
		ArraySet<T> o = (ArraySet<T>) other;
		if (o.size() != this.size()) {
			return false;
		}
		for (T item : this) {
			if (!o.contains(item)) {
				return false;
			}
		}
		return true;
	}

	public static <Glerp> ArraySet<Glerp> of(Glerp... stuff) {
		ArraySet<Glerp> returnSet = new ArraySet<Glerp>();

		for (Glerp x : stuff) {
			returnSet.add(x);
		}

		return returnSet;
	}

	public static void main(String[] args) {
		ArraySet<Integer> aset = new ArraySet<>();
		aset.add(5);
		aset.add(23);
		aset.add(42);

		//iteration
		//find out why there is a complier error
		for (int i : aset) {
			System.out.println(i);
		}

		Iterator<Integer> seer = aset.iterator();
		while (seer.hasNext()) {
			int i = seer.next();
			System.out.println(i);
		}
	}

}