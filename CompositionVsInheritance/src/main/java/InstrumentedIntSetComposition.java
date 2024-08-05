public class InstrumentedIntSetComposition implements InstrumentedIntSet {

    private int addCount;
    private final IntSet delegate;

    /**
     * Constructs a new instrumented integer set.
     */
    public InstrumentedIntSetComposition (IntSet delegate){
        this.delegate = delegate;
        addCount = 0;
    }



    /**
     * Returns the count of how many times an element has been added to the set.
     *
     * @return the count of added elements
     */
    public int getAddCount() {
        return addCount;
    }

    @Override
    public void add(int value) {
        delegate.add(value);
        ++addCount;
    }

    @Override
    public void addAll(int... values) {
        delegate.addAll(values);
        addCount += values.length;
    }

    @Override
    public void remove(int value) {
        delegate.remove(value);
    }

    @Override
    public boolean member(int value) {
        return delegate.member(value);
    }

}
