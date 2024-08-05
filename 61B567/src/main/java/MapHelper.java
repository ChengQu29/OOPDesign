import java.util.List;

/**
 * Class to demonstrate how generic methods work in Java.
 */
public class MapHelper {

	/* Write the following three methods:
	/* get(Key) : Return item in map if it exists.*/

	/*
	//in order for this to work, need to go the class declaration and put <K, V> there. But nobody is ever going to instantiate MapHelper class, it doesn't make sense to create map helper object.
	//so we need generic method
	public static V get(Map61B<K, V> sim, K key) { //sim: string integer map
		if (sim.containsKey(key)) {
			return sim.get(key);
		}
		return null;
	}
	*/

	// make the method generic, as opposed to making the entire class generic
	public static <K, V> V get(Map61B<K, V> sim, K key) { //sim: string integer map

		if (sim.containsKey(key)) {
			return sim.get(key);
		}
		return null;

	}

	/*
	maxKey(): Returns max of all keys. Works only if x and y have comparable data.
	 */

	/*
	public static <K, V> K maxKey(Map61B<K, V> map) {
		List<K> keyList = map.keys();
		K largest = keyList.get(0);
		for (K k : keyList) {
			if(k.compareTo(largest) > 0 ) {
				largest = k;
			}
		}
		return largest;
	}
	*/

	public static <K extends Comparable<K>, V> K maxKey(Map61B<K, V> map) {
		List<K> keyList = map.keys();
		K largest = keyList.get(0);

		for (K k : keyList) {
			if(k.compareTo(largest) > 0 ) {
				largest = k;
			}
		}
		return largest;
	}
}
