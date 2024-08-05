import org.junit.jupiter.api.Test;

// Lecture 6
public class ArraySetTest {

	@Test
	public void testExceptions() {
		ArraySet<String> aset = new ArraySet<>();
		aset.add(null);
		aset.add("duck");
		aset.add("horse");
	}

	@Test
	public void testToString() {

		ArraySet<Integer> aset = new ArraySet<>();
		aset.add(5);
		aset.add(32);
		aset.add(543);

		System.out.println(aset); //look up println

	}

	@Test
	public void testEquals() {
		ArraySet<Integer> aset1 = new ArraySet<>();
		aset1.add(5);
		aset1.add(32);
		aset1.add(543);

		ArraySet<Integer> aset2 = new ArraySet<>();
		aset2.add(5);
		aset2.add(32);
		aset2.add(543);

		System.out.println("aset1 equals aset2 ? " + aset1.equals(aset2));
		System.out.println(aset1.equals(null));
		System.out.println(aset1.equals("fish"));
	}

	@Test
	void testOfMethod() {
		ArraySet<String> aset = ArraySet.of("I", "am", "here");
		System.out.println(aset);
	}
}
