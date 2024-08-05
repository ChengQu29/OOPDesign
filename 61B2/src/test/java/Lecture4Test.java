import org.junit.jupiter.api.Test;

public class Lecture4Test {

	public static void peek(List61B<String> list) {
		System.out.println(list.getLast());
	}
	public static void peek(SLList<String> list) {
		System.out.println(list.getFirst());
	}

	@Test
	public void test() {
		SLList<String> SP = new SLList<>();
		List61B<String> LP = SP;
		SP.addLast("elk");
		SP.addLast("are");
		SP.addLast("cool");
		peek(SP);
		peek(LP);
		/*
		The first call to peek() will use the second peek method that takes in an SLList.
		The second call to peek() will use the first peek method which takes in a List61B.
		This is because the only distinction between two overloaded methods is the types of the parameters.
		When Java checks to see which method to call, it checks the static type and calls the method with the parameter of the same type.
		 */
	}

	@Test
	public void testVengenful() {
		VengefulSLList<Integer> vs1 = new VengefulSLList<Integer>();
		vs1.addLast(1);
		vs1.addLast(5);
		vs1.addLast(10);
		vs1.addLast(13);

		vs1.removeLast();
		vs1.removeLast();

		System.out.println("Lost items are: ");
		vs1.printLostItems();
	}


	@Test
	public void testVerboseDog() {

		VerboseDog dog = new VerboseDog();

		// this is to illustrate implementation inheritance can break encapsulation !
		dog.barkMany(3); // this will cause infinite loop
	}

	@Test
	public void testSomething() {
		

	}
}
