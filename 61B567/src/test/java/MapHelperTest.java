import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapHelperTest {

	@Test
	public void testGet() {

		Map61B<String, Integer> m = new ArrayMap<String, Integer>();

		m.put("horse", 3);
		m.put("fish", 9);
		m.put("house", 10);

		Integer actual = MapHelper.get(m, "fish");
		Integer expected = 9;
		assertEquals(expected, actual);
		assertEquals(null, MapHelper.get(m,"fjdklas;"));

	}

	@Test
	public void testMaxKey() {

		Map61B<String, Integer> m = new ArrayMap<String, Integer>();

		m.put("horse", 3);
		m.put("fish", 9);
		m.put("house", 10);

		String actual = MapHelper.maxKey(m);
		String expected = "house";
		assertEquals(expected, actual);
	}
}
