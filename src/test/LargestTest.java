import org.junit.Ignore;
import org.junit.Test;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;

//FailingTest
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


    //Timeouts

    @Test
   public void timeoutNotExceeded()
    {
        //The following assertion succeeds.
        assertTimeout(ofMinutes(2), () -> {
            // Perform task that takes less than 2 minutes.
        });
    }

    @Test
    public void timeoutExceeded()
    {
        // The following assertion fails with an error message
        assertTimeout(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(100);
        });
    }

    //DisablingTest

    @Ignore("Test is ignored as a demonstration")
    @Test
    public void testSame() {
        assertThat(1, is(1));
    }
}

