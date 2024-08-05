public interface InstrumentedIntSet extends IntSet {
    /**
     * Returns the count of how many times an element has been added to the set.
     *
     * @return the count of added elements
     */
    int getAddCount();
}