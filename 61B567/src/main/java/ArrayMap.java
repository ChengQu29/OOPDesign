import java.util.Set;

import java.util.List;
import java.util.ArrayList;

/***
 * An array-based implementation of Map61B.
 ***/
public class ArrayMap<K, V> implements Map61B<K, V> { // K,V are called generic type variables,
	// naming it K, V are completely arbitrary
	// For example, it can be named as Kfjkdls, Vjklfds

	private K[] keys;
	private V[] values;
	int size;

	//this is for educational purposes
	public ArrayMap() {
		keys = (K[]) new Object[3];
		values = (V[]) new Object[3];
		size = 0;
	}

	/*
	//the above code is for educational purposes, in industry usually the following is used:
	private List<K> keys;
    private List<V> values;
    private int size;

    public ArrayMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
        size = 0;
    }
	*/

	/**
	 * Returns the index of the key, if it exists. Otherwise returns -1.
	 **/
	private int keyIndex(K key) {
		for (int i = 0; i < size; i++) {
			if (keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}


	public boolean containsKey(K key) {
		int index = keyIndex(key);
		return index > -1;
	}

	public void put(K key, V value) {
		int index = keyIndex(key);
		if (index == -1) {
			keys[size] = key;
			values[size] = value;
			size += 1;
		} else {
			values[index] = value;
		}
	}

	//there is a bug in this method, if index don't exist, this method will crash. That's why we wrote MapHelper
	public V get(K key) {
		int index = keyIndex(key);
		return values[index];
	}

	public int size() {
		return size;
	}

	public List<K> keys() {
		List<K> keyList = new ArrayList<>();
		for (int i = 0; i < keys.length; i++) {
			keyList.add(keys[i]);
		}
		return keyList;
	}

	@Override public void clear() {

	}

	@Override public V remove(K key) {
		return null;
	}

	@Override public V remove(K key, V value) {
		return null;
	}

	@Override public Set<K> keySet() {
		return null;
	}
}
