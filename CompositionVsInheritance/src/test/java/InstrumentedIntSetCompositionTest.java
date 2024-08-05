import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstrumentedIntSetCompositionTest {

    @Test
    public void testAdd() {

        //IntSet delegate = new IntSet1(); //don't want to do this because don't want others to have access to delegate outside the class InstrumentedIntSetComposition

        InstrumentedIntSetComposition set1 = new InstrumentedIntSetComposition(new IntSet1());
        set1.addAll(1,2,3);

        assertEquals(3, set1.getAddCount());

    }

}