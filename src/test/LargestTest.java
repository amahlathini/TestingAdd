import org.junit.Test;

import static org.junit.Assert.*;

public class LargestTest {
    @Test
    public void testEmpty() {
        Largest largest = new Largest();
        try {
            largest.largest(new int[] {});
            fail("Should have thrown an exception");
        } catch (final RuntimeException e) {
            assertTrue(true);
        }
    }
}

