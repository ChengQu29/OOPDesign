import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntSet1Test {

    @Test
    public void testAdd() {
        IntSet1 set1 = new IntSet1();

        set1.add(1);
        set1.add(2);

        assertEquals(true, set1.member(1)&& set1.member(2));

    }

    @Test
    public void testAddAll() {
        IntSet1 set1 = new IntSet1();
        set1.addAll(1,2,3);

        assertEquals(true, set1.member(1)&& set1.member(2) && set1.member(3));

    }

    @Test
    public void testAddForInstrumentedIntSet1() {
        InstrumentedIntSet1 set1 = new InstrumentedIntSet1();

        set1.add(1);
        set1.add(2);

        assertEquals(2, set1.getAddCount());

    }

    /**
     ** this test will fail, debug to find out why
     */
    @Test
    public void testAddAllForInstrumentedIntSet() {

        InstrumentedIntSet1 set1 = new InstrumentedIntSet1();
        set1.addAll(1,2,3);

        assertEquals(3, set1.getAddCount());
    }

}