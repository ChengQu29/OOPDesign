
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMapTest {

	@Test
	public void test() {
		ArrayMap<Integer, Integer> am = new ArrayMap<Integer, Integer>();
		am.put(2, 5);
		int expected = 5;
		assertEquals(expected, am.get(2));
		assertEquals((Integer) expected, am.get(2));
	}

	@Test
	public void testGet() {

		Map61B<String, Integer> m = new ArrayMap<String, Integer>();

		m.put("horse", 3);
		m.put("fish", 9);
		m.put("house", 10);

		Integer actual = m.get("fish");
		Integer expected = 9;
		assertEquals(expected, actual);
		assertEquals(null, m.get("fjdklas;"));

	}
}
