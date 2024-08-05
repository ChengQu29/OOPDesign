/**
 * Interface for simple sets of integers.
 *  /***
 * Adds the given value to this set.
 *
 * @param value the integer add
 */
public interface IntSet {
    void add(int value);

    /**
    * Adds all the values in the given array to this set.
    *
    * @param values the integers to add
    */
    void addAll(int... values);

    /**
    * Removes the given value from this set, if present.
    *
    * @param value the integer to remove
    */
    void remove(int value);

    /**
    * Determines whether a particular integer value is a member of this set.
    *
    * @param value the integer to check
    * @return whether value is a member of this set
    */
    boolean member(int value);

}